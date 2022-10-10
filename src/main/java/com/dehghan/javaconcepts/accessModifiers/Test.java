package com.dehghan.javaconcepts.accessModifiers;

public class Test {

    public String herkes = "public değişken";
    protected String korumalı = "protected değişken";
    String düz = "default değişken";
    private String gizli = "private değişken";


    public static void main(String[] args) {
        Test testObjesi = new Test();
        System.out.println("erişebildiğim değişkenler:" + testObjesi.gizli + " " + testObjesi.herkes + " " +
                testObjesi.korumalı +" "+ testObjesi.düz
                );
    }
}
