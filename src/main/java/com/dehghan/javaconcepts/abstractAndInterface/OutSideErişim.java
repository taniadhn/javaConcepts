package com.dehghan.javaconcepts.abstractAndInterface;

import com.dehghan.javaconcepts.accessModifiers.Test;

public class OutSideErişim extends Test {

    public static void main(String[] args) {
        Test testObjesi = new Test();

        System.out.println("erişebildiğim değişkenler :" +
                testObjesi.herkes
                );
        OutSideErişim outSide = new OutSideErişim();
        System.out.println("erişebildiğim değişkenler:"+
                outSide.herkes +" " + outSide.korumalı
                );
    }
}
