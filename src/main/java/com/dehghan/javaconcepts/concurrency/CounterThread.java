package com.dehghan.javaconcepts.concurrency;

public class CounterThread extends Thread{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i< 100 ; i++){

            System.out.println(i);
        }
    }
}
