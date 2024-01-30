package com.ohgiraffers.section01.literal;

public class Application2 {

    public static void main(String[] args){
        System.out.println("====정수와 정수의 연산");
        System.out.println(123 + 456);
        System.out.println(123 - 23);
        System.out.println(123*10);
        System.out.println(123 % 10);

        System.out.println("======실수와 실수의 연산");
        System.out.println(1.23+1.23);
        System.out.println(1.23-0.23);
        System.out.println(1.23%1.0); //약간의 오차 발생가능

        System.out.println("정수와 실수의 연산======="); // 이 경우 항상 실수 출력
        System.out.println(123 + 0.5);
        System.out.println(123*0.5);
        System.out.println(123 / 0.5);
        System.out.println(123%0.5);

        System.out.println("====문자와 문자의 연산");//문자에 해당하는 숫자로 바뀌어 연산이 된다
        System.out.println('a'+'b');
        System.out.println('a'-'b');
        System.out.println('a'* 'b');
        System.out.println('a'/ 'b');
        System.out.println('a'%'b');

        System.out.println("문자와 숫자의 연산");
        System.out.println('a' + 1);
        System.out.println('a'-1);
        System.out.println('a'*2);
        System.out.println('a' / 2);
        System.out.println('a' % 2);

        System.out.println("문자와 실수의 연산");
        System.out.println('a'+ 1.0);
        System.out.println('a'-1.0);
        System.out.println('a'*2.0);
        System.out.println('a'/ 2.0);
        System.out.println('a'% 2.0);

        System.out.println("====문자열과 문자열의 연산 ===="); //+로 붙이기만 가능 다른건 불가능
        System.out.println("hello"+ "world");

        System.out.println("==========문자열과 다른 형태의 값 연ㅅ산"); // 이여붙이기만 간,ㅇ
        System.out.println("hellowor"+123);
        System.out.println("hellowor"+123.456);
        System.out.println("hellowor");
        System.out.println("hellowor");

        System.out.println("문자열 형태의 숫자 값 연산============"); //다 에러 발생
        //System.out.println(true +false);

        System.out.println("논리값과 정수의 연산은 모두 불가");

        System.out.println("논리값과 실수도 모두 에러");

        System.out.println("논리값과 문자의 연산도 불가");
        //System.out.println(true + 'a');

        System.out.println("=====논리와 문자열의 연산======"); //더하기만 가능
        System.out.println(true +"a");

    }
}
