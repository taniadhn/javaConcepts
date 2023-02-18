package com.dehghan.javaconcepts.concurrency;

public class OrderNumber implements Runnable{
    private int orderNo;
    private final Object LOCK = new Object();

    public OrderNumber(){
        this.orderNo = 1;
    }
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        synchronized (LOCK){
            this.orderNo++;
            System.out.println(Thread.currentThread().getName() + "orderNo =>" + this.orderNo);
        }


    }

    public int getOrderNo(){
        return orderNo;
    }
    public void  setOrderNo(int orderNo){
        this.orderNo = orderNo;
    }
}




