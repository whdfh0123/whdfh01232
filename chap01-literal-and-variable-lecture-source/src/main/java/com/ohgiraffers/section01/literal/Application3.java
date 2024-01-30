package com.ohgiraffers.section01.literal;

public class Application3 {
    public static void main(String[]args){
        System.out.println("======두개의 문자열 합치기 ======");
        System.out.println(9+9);
        System.out.println("9"+9);
        System.out.println(9+"9");
        System.out.println("9"+"9");

        System.out.println("=====세개의 문자열 합치기==========");
        System.out.println(9+9+"9"); //+연산은 왼쪽부터 시작 (숫자부터 합쳐짐)
        System.out.println(9+"9"+9);
        System.out.println("9"+9+9);

        System.out.println("======10과 20의 사칙연산 결과");
        System.out.println(10+20);
        System.out.println(10-20);
        System.out.println(10*20);
        System.out.println(10/20);
        System.out.println(10%20);

        System.out.println("======10과 20의 사칙연산 결과 보기좋게");
        System.out.println("10과 20의 합 : "+ (10+20)); //괄호가 없다면 결과가 1020으로 출력
       // System.out.println("10과 20의 차 : "+ 10-20); //문자열은 +만 가능하기에 에러 발생 괄호 필수
        System.out.println("10과 20의 차 : "+ (10-20));
        System.out.println("10과 20의 곱 "+(10*20));
        System.out.println("10과 20의 나누기 한 몫 : "+ (10/20));
        System.out.println("10과 20을 나누기 한 나머지 : "+ (10%20));

        System.out.println("기차");
        System.out.println("기차"+"칙칙폭폭");
        System.out.println("기차"+123+45+"출발");
        System.out.println(123 + 45+ "기차"+"출발");
        


    }
}
