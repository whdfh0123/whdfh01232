package com.ohgiraffers.section01.method;

public class Calculator {
    public int minNumber(int first, int second){
        return (first > second) ? second : first;
    }
    public static int maxNumber(int first, int second){
        return (first > second) ? first : second;
    }
}
