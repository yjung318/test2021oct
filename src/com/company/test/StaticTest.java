package com.company.test;

public class StaticTest {

    public static void main(String arv[]) {
        doStaticTest();
        doNonStaticTest();
    }
    static void doStaticTest() {
        MyNumber mn = new MyNumber();
        int staticMethodCalled = MyNumber.getMyBirthday();
        int staticMethodCalled2 = mn.getMyBirthday(); // THIS WORKS, BUT SHOULD NOT BE USED THIS WAY!!
    }
    static void doNonStaticTest() {
        MyNumber mn = new MyNumber();
        int nonStatic = mn.getMyNumber();
        int nonStatic2 = MyNumber.getMyNumber(); // THIS DOES NOT COMPILE!!
    }
}
