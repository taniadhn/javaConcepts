package com.dehghan.javaconcepts.lambdaExpressions;

import java.util.ArrayList;

public class StreamAPI {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Mohammad");
        list.add("Mahdi");
        list.add("Haniyeh");
        list.add("Tania");
        list.add("Mohammad");
        list.add("Arezoo");
        list.add("Zarrintaj");
        list.add("Mohammad");
        /**Before JDK8**/
     /*   for ( int i =0; i< list.size(); i++){
            System.out.println(list.get(i));
        }*/
        /***OR*/
  /*      for (String i:list) {
            System.out.println(i);
        }*/

        /********StreamAPI***********/

        // list.stream().forEach(i -> System.out.println(i));
        //list.stream().filter(i -> i =="Tania").forEach(i -> System.out.println(i));
        //list.stream().distinct().forEach(i-> System.out.println(i));
        // list.stream().limit( 2L).forEach(i-> System.out.println(i));
        //list.stream().skip(3L).distinct().limit(2L).forEach(i-> System.out.println(i));
       /*long c = list.stream().count();
        System.out.println(c);*/
      /*  boolean control = list.stream().anyMatch(i -> i == "Mohammad");
        System.out.println(control);*/
       list.stream().map(i-> i + " " +"Dehghan").forEach(i-> System.out.println(i));
    }
}
