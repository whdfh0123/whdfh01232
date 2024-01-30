package com.ohgiraffers.section04.overflow;

public class Application {
    public static void main(String[] args) {
        /*자료형 별 값의 최데 범위를 벗어나는 경우
        발생한  carry를 버림처리 하고 sign bit를 반전시켜 최소값으로 순환시킴

         */
        byte num1 = 127;
        System.out.println(num1); //byte의 최대 범위

        num1++;
        System.out.println(num1);
        num1++;
        System.out.println(num1);//최대를 넘어가 오버플로우

        /* 언더플로우
        오버와 반대 개념 최소값보다 작은 수를 입력하면 빌셍

         */
        byte num2 = -128;
        System.out.println(num2);
        num2--;
        System.out.println(num2); //오버플로우와 비슷하게 작용

        int firstNum = 1000000;
        int secondNum = 700000;

        int multi = firstNum*secondNum;
        System.out.println(multi); //7천억이라 int값 넘어감
        System.out.println("firstNum * secondNum : " +multi);//컴파일에러는 아니지만 논리적 에러

        long longMulti = firstNum*secondNum;
        System.out.println("찐출력" +longMulti);

        long result = (long) firstNum*secondNum;
        System.out.println(result); //형변환을 해주어 정상적으로 들어감

        byte bnum = 127;
        bnum++;
        System.out.println("현재 bnum의 값 : "+bnum);



    }
}
