package com.dehghan.javaconcepts.concurrency;

public class CounterRunnable implements Runnable{

    private String name;
    private int id;
    private boolean live = true;

    public CounterRunnable(String name, int id){
        this.name =name;
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println(this.getName() + "Program Başlattı");
        int i = 0;
        for ( i =0; i< 100; i++){ while (live)
            try {
                Thread.sleep(2000 *this.id);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println( this.getName() + ":" + i++);
        }

    }
    public void stop(){
        this.live = false;
    }
    public String getName(){
        return name;
    }
    public void  setName(String name){
        this.name =name;
    }
}
