package com.dehghan.javaconcepts.polymorphisim;

public class Test {


    public static void main(String[] args) {

       // sum(2,3);
       // sum("2",8);
       // sum(4,5,8);

        Dog doggy = new Dog();
        System.out.println(doggy.hareket());

        Snake sk = new Snake();
        System.out.println(sk.hareket());

    }

    public static int sum(int a, int b){

        return a+b;
    }

    public static int sum(int a, int b, int c){

        return a+b+c;
    }

    /** aynı sayıda arguman olup typeları farklı ise yine bir method overloading oluyor */
    public static int sum(String a, int b){
        return 0;
    }
}

class Animal{

    public String hareket(){

        return "hareket ederim.";
    }

}

class Dog extends Animal{

    public String hareket(){

        return "Koşarım";
    }
}

class Snake extends Animal{


}
