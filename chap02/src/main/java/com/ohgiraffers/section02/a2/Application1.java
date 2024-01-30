package com.ohgiraffers.section02.a2;

public class Application1 {
    public static void main(String[] args) {
        /*
        대입연산자와 산술 복합 대입 연산자
        = : 왼쪽의 피연산자에 오른쪽의 피연산자를 대입
        += : 합친 결과를 왼쪽에 대입
        -= : 뺀 결과를 왼쪽에 대입
        *= : 왼쪽에 곱한 결과를 대입
        /= 나눈 결과를 대입
        %= 나머지 결과를 대입
         */
        int num = 12;
        System.out.println("num = " + num);
        num += 3;
        System.out.println(num);
        num -=3;
        System.out.println(num);
        num*=2;
        System.out.println(num);
        num/=2;
        System.out.println(num);
        num%=2; // ' = ' 의 순서가 바뀌면 안댐
        System.out.println(num);

    }
}
