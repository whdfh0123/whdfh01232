package com.ohgiraffers.section02.variable;

public class Application3 {
    public static void main(String[] args) {
        /*변수 이름의 규칙
        변수의 이름을 지을 떄 규칙이 있다
        실무적으로 필요하기 떄문에 반드시 숙지
        변수의 명명규칙
        1. 컴파일 에러를 발생시키지 않기
        1-1 동일한 범위 내에서 동일한 변수명을 가질 수 없다
        1-2 예약어는 사용이 불가능하다
        1-3 변수명은 대소문자를 구분한다(자바는 원래 구분)
        1-4 변수명은 숫자로 시작할수없다(나중에 들어가기는 가능)
        1-5 특수 기호는 _와 $만 사용 가능하다(공백도 사용X)
        2 에러는 아니지만 개발자들끼리의 규칙
        2-1 변수명의 길이는 너무 길지 않게 조절
        2-2 변수명이 합성어로 이루어진 경으 첫 단어는 소문자 두번째 시작 단어는 대문자로
        2-3 단어와 단어 사이의 연결을 _ 로 하지 않는다 (다른 언어의 규칙이라)
        2-4 한글로 변수명을 짓는 것이 가능하지만 권장하진 않음(에러유발 가능성)
        2-5 뱐수 안에 저장된 값이 어떤 의미를 가지는지 명확하게 표현하도록 한다
        2-6 전형적인 변수 이름이 있다면 가급적 사용하도록 한다
        2-7 명사형으로 작성하기
        2-8 boolean형은 의문문으로 가급적 긍정형태로 네이밍한다

         */
        int age = 20;
//        int age = 20; 동일한 변수명 금지

//        int true = 1;
//        int for = 20; 예약어 사용 불가
        int Age = 20; // age와 대문자 구분으로 다른 변수이다
        int True = 10; //예약어 true와 다른 것으로 취급 그래서 가능

//        int 1age= 20; 숫자로 인식해버려 에러 발생
        int age1 = 10;
        int _age = 20;
        int $g2q = 20;
//        int -g2q = 20; 특수기호는 저 2개만 사용가능
        int qwosafsaonfouiwhfasbjfiub = 10;
        int maxAge = 20;

        String user_name;// _로 연결하지 않기
        String userName;
        String s;//의도가 파악됟록 네이밍

        int sum = 0;
        int max = 10;
        int min = 0;
        int count = 1;

        String goHome; //가급적 명사형으로 해주기
        String home;

        boolean isAlive = true;
        boolean isDead = false; // 부정적인 것 보단 긍정적인 걸로

    }
}
