package com.ohgiraffers.section05.logical;

public class Application3 {
    public static void main(String[] args) {
        /* AND 연산과 or 연산의 특징
        논리식 && 논리식 : 앞의 결과가 false이면 뒤를 실행하지 않음
            >> 모두 만족해야 하기에 앞이 true면 뒤의 조건도 확인하지 않음

        논리식 || 논리식 : 앞의 결과가 true 이면 뒤를 실행하지 않음
            >> 앞만 true면 만족하기 때문에 뒤의 조건 확인 필요X

        뒤까지 확인하지 않아야 연산이 빠르니 가능하면 조건에 빨리 탈출하게 하기

         */

        int num1 = 10;
        int num = 2;
        // 사용법 : (조건문) ? 참에 출력할것 : 거짓에 출력할것
        int result = (false && ++num1 > 0)? num1:num;
        System.out.println(result);

        int num2 = 10;
        int result2 = (true || ++num2>0)? num2:num;
        System.out.println(result2);
    }
}
