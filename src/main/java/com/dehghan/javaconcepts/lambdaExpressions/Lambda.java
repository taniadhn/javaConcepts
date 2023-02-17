package com.dehghan.javaconcepts.lambdaExpressions;

public class Lambda {

    public static void main(String[] args){

        //Before JDK8
        Runnable r = new Runnable() {
            //We used anonymos class
            @Override
            public void run() {
                System.out.println("Runnable");
            }

        };
        r.run();
        /*********************************/
        //after JDK8
        Matemathics sum = (a,b) -> a+b;
        Matemathics  subtrace = (a,b) -> {
            return a-b;
        };
        System.out.println(sum.transactions(10,20));
        System.out.println(subtrace.transactions(78,62));


    }


}
