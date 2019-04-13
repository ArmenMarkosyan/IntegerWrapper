package com.aca.test;

public class test {
    public static void main(String[] args) {

        IntegerWrapper integerWrapper1 = new IntegerWrapper(5);
        IntegerWrapper integerWrapper2 = new IntegerWrapper(10);

        IntegerWrapper.swap(integerWrapper1, integerWrapper2);

        System.out.println("integerWrapper1 : " + integerWrapper1.getNumber());
        System.out.println("integerWrapper2 : " + integerWrapper2.getNumber());
    }
}
