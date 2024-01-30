package com.ohgiraffers.section04.scanner;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /*java.util.Scanner를 이용 다양한 자료형 값 입력 받기

         */
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        String name = sc.nextLine(); //문자열
        System.out.println("입력하신 이름은 : "+name+ "입니다.");

        System.out.print("나이를 입력하세요 : ");
        int age = sc.nextInt();
        System.out.println("입력하신 나이는 : "+age+ "입니다.");

        System.out.print("키를 입력하세요 : ");
        float heigh = sc.nextFloat();
        System.out.println("입력하신 키는 "+heigh+"입니다.");

        System.out.print("true 또는 false를 입력 : ");
        boolean isTrue = sc.nextBoolean();
        System.out.println("입력하신 논리값은 "+ isTrue+ "입니다");

        //char는 입력받는게 없다
        //문자열을 받고 문자열 중 몇번째 값을 받을지는 가능하다

        sc.nextLine();// 다른것과 달리 여기에 더 적어줌 오류방지
        System.out.print("아무 문자나 입력해 주세요 : ");
        char ch = sc.nextLine().charAt(0);
        System.out.println("입력하신 문자는 "+ ch+"입니다");




    }
}
