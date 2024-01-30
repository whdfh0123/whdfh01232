package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {


    /*스캐너 next 메소드들은 입력한 내용을 버퍼로부터 토큰단위로 분리해서 읽어온다
    그래서 크게 두 가지 사항을 주의해야 한다
    1. next()로 문자열 입력 받은 후 정수, 실수, 논리값을 입력 받을 대
    2. 정수, 실수, 논리값 입력 후 next()로 문자열 입력받을 때

     */
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력 : ");
        String str1 = sc.next(); // >> 1. 공백 전까지 인식
        System.out.println("num1 :" +str1);

        sc.nextLine();  // >> 3. 그래서 공백 이후로 오는건 여기로 오게 막아줌

        System.out.print("숫자 : ");
        int num1 = sc.nextInt(); // >> 2. 위에서 공백 후로 입력하면 여기로 넘어옴
        System.out.println("num1 :" +num1);

        /* 정수, 실수 논리값 입력 후 >>nextLine<<으로 문자열 받을때

         */
        System.out.print("정수를 써주세요 : ");
        int num2 = sc.nextInt();
        System.out.println("num 2 : "+num2);

        System.out.print("공백이 있는 문자열 입력하기 : ");

        sc.nextLine(); //이게 없으면 이번 단계 점프함 정수, 실수 등 입력후 써야함
        String str2 = sc.nextLine();
        System.out.println("str2 : "+ str2);
    }
}
