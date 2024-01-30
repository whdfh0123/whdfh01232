package com.ohgiraffers.section05.typecasting;

public class Application1 {
    public static void main(String[] args) {
        /* 데이터 형변환 저버애서 다른 타입끼리의 연산은 피연산자들이 모두 같은 타입인 경우 실행할 수 있다
        즉 같은 데이터 타입끼리만 연산 수행 가능

        형변환은 종류 와 규칙
        1. 자동 형변환 (묵시적 형변환) : 컴파일러가 자동으로 ㅜ행해주는 변환
        1-1 작은 자료형에서 큰 자료형으론 자동으로 변환
        1-2 정수는 실수로 자동 형변환 된다
        1-3 문자형은 int형으로 자동 형변환 된다
        1-4 논리형은 형변환 규칙에서 제외된다
        2. 강제형변환 : 형변환 연산자를 이용한 강제적으로 수행하는것
        2-1자동으로 안해줄때사용

         */
        //점점 더 큰 자료형으로 옮기는 것은 문제X
        byte bnum = 1;
        short snum = bnum;
        int inum = snum;
        long lnum = inum;

        int num1 = 10;
        long num2 = 20;
//        int result = num1+num2; 자동으로 long으로 바뀌면서 연산하기 때문에 int에 결과를 담기가 불가능
        long result1 = num1+num2; //long으로 연산후 정상적으로 담기 완료
        System.out.println(result1);

        float fnum = 3.0f;
        double dnum = fnum;

        double result2 = fnum+dnum;
        System.out.println(result2);

        /*정수를 실수로 변경할때 소수좀 저라슈거 옶옫도 살수형태로 표현가능
        이때 데이터 손실이 없어서 자동으로 가능하다

         */
        long eight = 8;
        float four = eight;
        System.out.println(four);
        float result3 =eight+four;


        System.out.println(result3);
        char ch1 = 'a';
        int charNumber = ch1;
        System.out.println(charNumber);
        //문자형은 int형으로 자동우로 형변환된다



        System.out.println(charNumber);
//      어떤 자료형이던 boolran을 형변환 불가


    }
}
