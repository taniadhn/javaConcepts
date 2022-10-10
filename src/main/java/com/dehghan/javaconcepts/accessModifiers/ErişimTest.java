package com.dehghan.javaconcepts.accessModifiers;

public class ErişimTest {

    public static void main(String[] args) {

        Test testObjesi = new Test();

        System.out.println("Erişebildiğim değişkenler:" +
                testObjesi.düz +""+ testObjesi.herkes +""+ testObjesi.korumalı
                );
    }
}
