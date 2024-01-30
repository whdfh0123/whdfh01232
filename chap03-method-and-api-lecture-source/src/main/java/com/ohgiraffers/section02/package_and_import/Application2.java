package com.ohgiraffers.section02.package_and_import;

//import com.ohgiraffers.section01.method.Calculator;
//import com.ohgiraffers.section01.method.Calculator;

import com.ohgiraffers.section01.method.Calculator;

import static com.ohgiraffers.section01.method.Calculator.maxNumber;


public class Application2 {
    public static void main(String[] args) {
        /*
        임포트란
        서로 다른 패키지에 존재하는 클래스를 사용허는 경우
        메번 풀 클래스 명을 기술하기 힘듬ㅎ
        그래서 어떠한 패키지 내에 있는 클래스를 상룡할거인지
        미리 선언하는 임포트문을 사용하면 풀네임 매번쓰기X
        /*non static 메소드

         */
        Calculator calc = new Calculator();
        int min = calc.minNumber(50,60);
        System.out.println(min);

        //static
        int max = Calculator.maxNumber(50,60);

        System.out.println("더 큰 수 : "+max);

        int max2 = maxNumber(100,200);
        System.out.println("큰 수 : "+max2);




    }
}
