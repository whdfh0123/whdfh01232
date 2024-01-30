package com.ohgiraffers.section02.package_and_import;

public class Application1 {
    public static void main(String[] args) {
        /*패키지란
        * 서로 관련 있는 클래스 또는 인터페이스 등을 모아 하나의 묶음으로
        * 단위를 구성하는것
        * 같은 패키지에서는 클래스명이 달라야 하지만
        * 패키지가 다르면 클래스명 같아도 ㄱㅊ
        * 클래스명은 원래 패키지명을 포함하기 때문
        * 그렇기 때문에 다른 패키지에 존재한는 클래스를 사용하는 경우는
        * 패키지명을 명시해야한다
        * */
        com.ohgiraffers.section01.method.Calculator calc = new com.ohgiraffers.section01.method.Calculator();
        int min = calc.minNumber(30,20);
        System.out.println("30과 20중 작은수 : "+min);

        int max = com.ohgiraffers.section01.method.Calculator.maxNumber(30,20);
        System.out.println("30과 20중 큰 수 : "+max);
    }
}
