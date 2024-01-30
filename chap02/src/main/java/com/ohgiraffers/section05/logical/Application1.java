package com.ohgiraffers.section05.logical;

public class Application1 {
    public static void main(String[] args) {
        /*논리 연산자의 종류
        1. 논리 연결 연산자 : 두 개의 피연삱핳 가진 이형 연사자이며 두 개의 논리식을 판판단하여 참과ㅏ 거짓을 판단
        1-1 && 논리 연산자 : 두 개의 논리식 중 2개 모두 참이어야함
        1-2 || 논리 연산자 : 둘중 하나민 참이어도 참 반환하기
        2. 논리 부정 연산자 : 피연산자가 하나인 단항 연산자
        2-1 ! 연산자 : 논리식의 결과가 참이면 거짓, 거짓이면 참반환
         */
        System.out.println("true && true : "+(true && true));
        System.out.println("true && false : "+(true && false)); //순서가 뒤집혀도 결과는 같음
        System.out.println("false && false : "+(false && false)); //순서가 뒤집혀도 결과는 같음
        System.out.println('\n');
        System.out.println("true || true : "+(true || true));
        System.out.println("true || false : "+(true || false));
        System.out.println("false || false : "+(false || false));

        System.out.println(!true);
        System.out.println(!false);

        //논리식에 논리 연산자 활용
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        System.out.println("a가 b보다 작으면서 c가 d보다 작은지 >> " +(a<b && c< d));
        System.out.println("a가 b보다 작으면서 c가 d보다 큰지 >> " +(a<b && c> d));
        System.out.println("a가 b보다 크면서 c가 d보다 큰지 >> " +(a>b && c> d));

        System.out.println("a < b || c < d : "+(a < b || c < d));  //하나만 true 라면 true 출력
        System.out.println("a < b || c > d : "+(a < b || c > d));
        System.out.println("a > b || c < d : "+(a > b || c < d));
        System.out.println("a > b || c > d : "+(a > b || c > d));

    }
}
