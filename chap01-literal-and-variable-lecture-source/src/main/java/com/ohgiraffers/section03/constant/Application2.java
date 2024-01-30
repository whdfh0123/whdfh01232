package com.ohgiraffers.section03.constant;

public class Application2 {
    public static void main(String[] args) {
        /*상수의 명명 규칙
        상수의 명명 규칙은 변수의 명명규칙과 컴파일 에러를 발생시키는 규칙은 동일하더
        암묵적인 규칙에서는 일부 차이가 있다
        1. 모든 문자는 영문자 대문자 혹은 숫자만 사용한다
        2. 단어와 단어 연결은 언더스코어___를 사용한다
         */
        final int AGE1 = 20;
        final int AGE2 = 30;
        final int age3 = 30; //사용은 가능하지만 변수와 헷갈림 대문자 사용하기

        final int MAX_AGE = 5;
        final int MIN_AGE = 20;
        final int minAge = 2; //comelcase 사용은 가능하짐ㄴ 변수가 사용하기 위해 안씀
    }
}
