package com.dehghan.javaconcepts.concurrency;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        /****1****/
       /* System.out.println("Program Başladı!");
        for (int i =0; i< 100 ; i++){
            System.out.println(i);
        }
        System.out.println("Program Bitti !");*/

        /******2******/
       /* CounterThread c1 = new CounterThread();
        CounterThread c2 = new CounterThread();
        c1.start();
        c2.start();*/

        /******3******/
      /*  CounterRunnable c1 = new CounterRunnable("c1",1);
        Thread t1 = new Thread(c1);
        t1.start();
        c1.stop();

        CounterRunnable c2 = new CounterRunnable("c2",2);
        Thread t2 = new Thread(c2);
        t2.start();
        c1.stop();*/

        /**********4***********/
        OrderNumber oMatic = new OrderNumber();
      /*  List<Thread> islemler = new ArrayList<>();
        for (int i = 0; i<100 ; i++) {
            Thread t1 = new Thread(oMatic);
            islemler.add(t1);
            t1.start();

        }*/
    /*    for (Thread t: islemler
             ) {
            t.join();

        }*/
        ExecutorService pool = Executors.newFixedThreadPool(20);
        pool.execute(oMatic);


    }
}
