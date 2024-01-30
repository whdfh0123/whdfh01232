package com.ohgiraffers.section01.arithmetic.a1;

public class Application1 {
    public static void main(String[] args) {
        /* 산술 연산자
        사칙연산과 관련된 연산자로 가장 기본이면서 많이 사용
        연산의 실행ㅇ디 가능하기 위해 필요한 값이나 ㅇ변수가 2갸인 이항연산자
        연산 방향은 왼쪽에서 오른쪽
        종류
        +왼쪽의 피연산자에 오늘쪽의 피연산자를 더함
        - 왼쪽의 피연산자에 오늘쪽의 피연산자를 뺌
        *왼쪽의 피연산자에 오늘쪽의 피연산자를 곱함
        / 왼쪽의 피연산자에 오늘쪽의 피연산자를 나눔
        %왼쪽의 피연산자에 오늘쪽의 피연산자를 나눈 나머지를 반환


        산술 연산자의 우선 순위
        수학의 개념과 유사하게 곱하기와 나누기 연산이 더하기와 빼기 연산보다 우선
        우선순위가 같은 경우 연산자의 결합 방향에 의해 실행순서 결정

         */
        int num1 = 20;
        int num2 = 7;
        System.out.println("num1 + num2 = " + (num1+num2));
        System.out.println("num1 - num2 = " + (num1-num2));
        System.out.println("num1 * num2 = " + (num1*num2));
        System.out.println("num1 / num2 = " + (num1/num2));
        System.out.println("num1 % num2 = " + (num1%num2));

    }
}
