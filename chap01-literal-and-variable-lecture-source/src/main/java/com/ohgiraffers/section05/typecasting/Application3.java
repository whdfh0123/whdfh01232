package com.ohgiraffers.section05.typecasting;

public class Application3 {
    public static void main(String[] args) {
        /*
        지동 형변환과 강제 형변환을 이용한 다른 자료형끼리의 연산
        다른 자료형끼리 연산은 큰 자료형으로 자동 형변환 후 연산 처리
         */
        int inum= 10;
        long lnum = 100;
//        int isum = inum+lnum; 연산의 결과는 long이라 int에 담기가 불가능
        int isum = (int)(inum+lnum); // 식을 묶어서 변환 or lnum앞에 붙이기 가능
        System.out.println(isum);

        long lsum = inum+lnum; //결과를 long으로 받으면 자동 형변환
        System.out.println(lsum);

        //int 미만의 연산 처리 결과는 int형이다

        byte bnum1 = 1;
        byte bnum2 = 2;
        short sNum1 =3;
        short sNum = 4;

        int result = bnum1+bnum2;
        int result2 = bnum1+sNum;
        int result3 = sNum+bnum1;
        long result4 = sNum+sNum1;
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
