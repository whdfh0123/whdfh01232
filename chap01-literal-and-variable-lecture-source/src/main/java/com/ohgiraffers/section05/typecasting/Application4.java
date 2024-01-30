package com.ohgiraffers.section05.typecasting;

public class Application4 {
    public static void main(String[] args) {
        /*형변환 시 주의
        데이터 손실에 유의해서 사용하기

         */
        //의도하지 않은 데이터 손실
        int inum = 290;
        byte bnum = (byte)inum;

        System.out.println(inum);
        System.out.println(bnum); //비트 앞부분 손실로 예측 어려움

        //의도한 데이터 손실 (소수점 등을 없애기 가능)
        double height = 175.8;
        int floorHeight = (int)height;
        System.out.println(floorHeight);

    }
}
