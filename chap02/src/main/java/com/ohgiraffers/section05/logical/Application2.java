package com.ohgiraffers.section05.logical;

public class Application2 {
    public static void main(String[] args) {
        /*
        논리 연산자의 우선순위
        11순위 : &&
        12쉰위 : ||

         */
        // 이항 연산자이기 때문에 1<=num<=100 으로는 부족하다 하나씩 비교해서 참, 거짓을 구분하자
        int num1 = 55;
        System.out.println("1부터 100사이인지 : " + (1 <= num1 && num1 <=100));

        int num2 = 175;
        System.out.println("1부터 100사이인가 : "+(1<=num2 && num2 <=100));

        char ch = 'T'; // 숫자 대신 문자로 넣어도 가능하다
        char ch2 = 'w'; // 숫자 대신 문자로 넣어도 가능하다
        System.out.println("영어 대문자 인지 : "+(64 < ch && ch < 91));
        System.out.println("영어 대문자 인지 : "+(64 < ch && ch2 < 91));

        //대소문자 상관없이 Y인지 확인하기
        char ch3 = 'y';
        System.out.println("알파벳 y 인가요? : " + ('Y'==ch3 || 'y'==ch3));

        //영문자인지 확인하기
        char ch4 = 'A';
        System.out.println("영문자인지 확인 : "+(('A'<=ch4 && 'Z'>=ch4)||('a'<=ch4 && 'z' >= ch4)));
    }
}
