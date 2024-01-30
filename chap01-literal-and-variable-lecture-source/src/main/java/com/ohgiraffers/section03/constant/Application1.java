package com.ohgiraffers.section03.constant;

public class Application1 {
    public static void main(String[] args) {
        /*상수란 변수가 메모리에 변경될 값을 저장하기 위한 공간ㅇ을 나타낸다면 상수는 상반되는 개념이다
        변하지 않는 값을 저장하기 위한 공간

        사용 목적
        변경되지 않는 고정된 값을 저장할 목적으로 사용
        초기화 이후 값 대입 시 컴파일 에러를 발생시켜  값이 수정되지 못하도록 한다

        사용법
        상수를 선언한다 (final키워드 사용
        값을 초기화한다 (초기화 이후에는 값 변경 불가)
        필요한 위치에 상수 호출
         */

        final int AGE;

        AGE = 10;
        // 한번 초기화 시 변경 불가
        System.out.println("AGE의 값 : " + AGE);
        System.out.println("AGE 값의 2배 : "+AGE * 2);

        int sum = AGE;
//        int AGE = AGE +10; 대입 연산자 왼쪽에 가서 대입 받기는 불가능

    }
}
