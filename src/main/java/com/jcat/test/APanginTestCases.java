package com.jcat.test;

public class APanginTestCases {

    public static void main(String[] args) {
        final StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            stringBuilder.delete(0, 1);
            stringBuilder.append(i);
        }
        System.out.println(stringBuilder.length());
    }
}
