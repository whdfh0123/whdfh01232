package com.ohgiraffers.section03.math;

public class Application2 {
    public static void main(String[] args) {
        /*난수의 활용
        (int)(Math.random() * 구하려는 난수의 갯수
         */
    int random1 = (int)(Math.random()*10);  //0~9까지 난수 발생
        System.out.println("0~9난수 : "+ random1);

        int random2 = (int)(Math.random()*10)+1;
        System.out.println("1~9난수 : "+ random2);


        int randim3 = (int)(Math.random()*6)+10;//10~15
        System.out.println(randim3);

    }
}
