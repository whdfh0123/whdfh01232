package com.ohgiraffers.section05.typecasting;

public class Application2 {
    public static void main(String[] args) {
        /**강제 형변환 '\
         * 바꾸려넌 자료형으로 강제
         *
         * 1. 자동형안댐 강제
         * 1-2 실수를 정수로 하려면 강제로
         * 1-3
         */
        long lnum =8;
        int inum = (int)lnum;
        short snum = (short) inum;
        byte bnum = (byte) snum;


        double dnum = 8.0;
        float fnum = (float) dnum;
        System.out.println(fnum);

        float fnum2 = 4.0f;
        long lnum2 = (long)fnum2; //

        System.out.println(fnum2);
        System.out.println(lnum2);

        //*문자형을 int 미만 크기의 변수에 저장할때 강제 형변환 필요

        char ch = 'a';
//        byte bnum = (byte)ch;
        short snum2 = (short)ch; //같은 2byte지만 부호비트 값이 달라서 써야함
//        boolean isTure;
    }
}
