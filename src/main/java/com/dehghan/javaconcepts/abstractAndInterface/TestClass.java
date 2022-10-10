package com.dehghan.javaconcepts.abstractAndInterface;

public class TestClass {

    public static void main(String[] args) {

    }
}

interface Boy{
    int degisken = 0;
    static String tanim() {
        return "Bu interface implement eden class icin "
                + "boy bilgileri donulmesini garanti eder.";
    }
    int boySantimetre();
    double boyMetre();
    default double boyKilometre() {
        return 0;
    }
}

abstract class Hayvan implements Boy{

    private int boy;
    private int kilo;
    public abstract  boolean canlıMı();

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public int getKilo() {
        return kilo;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }
}

class Insan extends Hayvan{


    @Override
    public int boySantimetre() {
        return 0;
    }

    @Override
    public double boyMetre() {
        return 0;
    }

    @Override
    public double boyKilometre() {
        return super.boyKilometre();
    }

    @Override
    public boolean canlıMı() {
        return false;
    }
}
