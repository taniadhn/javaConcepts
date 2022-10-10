package com.dehghan.javaconcepts.concurrency;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class ConcurrentTasks {

    public static void main(String[] args) {

        //Runnable run edilecek program parçacığı. Void gibi bir şey döndürmüyor
        //Bir method bir Objeye atıyoruz gibi düşünebilirsiniz.
        Runnable run= ()-> System.out.println("I am a runable program");
        //THreat neyi run edeceğini vermemiz gerekiyor
        Thread t = new Thread(run);
        t.start();

        //Bu bizim için paralel servisler açıyor. 10 tane paralel threat açacak
        ExecutorService  executor = Executors.newCachedThreadPool(); //////newFixedThreadPool(10);

        List<Runnable> runnableList = Arrays.asList(
                ()-> System.out.println("Runnable Code 1"),
                ()-> System.out.println("Runnable Code 2"),
                ()-> System.out.println("Runnable Code 3"),
                ()-> System.out.println("Runnable Code 4"),
                ()-> System.out.println("Runnable Code 5")
        );

        //Callable return ediyor
        List<Callable<Integer>> listOfCallable = Arrays.asList(
                ()-> {int a =1;
                    System.out.println("Callable 1"); return a;},
                ()-> {int a = 1;
                    System.out.println("Callable 2"); return a;},
                ()-> {int a =1;
                    System.out.println("Callable 3"); return a;}
        );

        try {
           List<Future<Integer>> results =  executor.invokeAll(listOfCallable);
           results.forEach(r-> {
               try {
                   System.out.println( "Results" + r.get());
               } catch (InterruptedException e) {
                   e.printStackTrace();
               } catch (ExecutionException e) {
                   e.printStackTrace();
               }
           });

        }catch (InterruptedException e){
            e.printStackTrace();

        }

        //Runnable birşey executorlar ile çağırmak istersek neapacağız
        IntStream.range(0,5).forEach(i-> executor.submit(runnableList.get(i)));

        /**2.method
         * Thread.currentThread().getName() --> hangi threat tarafında erişeceğim
         * */
        IntStream.range(0,100).forEach(i-> executor.submit(
                ()-> System.out.println("Task" +i + "executor by" + Thread.currentThread().getName())
        ));
    }
}
