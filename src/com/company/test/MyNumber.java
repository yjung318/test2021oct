package com.company.test;

public class MyNumber {
    private static final int YUMIKO_BD = 196652;
    private int myNumber = 0;

    public static int getMyBirthday() {
        return YUMIKO_BD;
    }

    public int getMyNumber() {
        return myNumber;
    }

    public void changeMyNumber(int num) {
        myNumber = (int) (num * Math.random());
    }
}
