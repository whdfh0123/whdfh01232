package com.ohgiraffers.section04.scanner;
import java.util.Scanner;
public class Application2 {
    public static void main(String[] args) {
        /*
        nextLine() : 공백을 포함한 한 줄을 입력하기 위한
        개행문자 전 까지 읽어서 문자열로 반환(공백포함)
        next() : 공백문자나 개행문자 전 가지를 읽어서 문자열로 반환 (공백문자 포함하지 않음)

         */
        Scanner sc = new Scanner(System.in);

        System.out.print("인사말을 입력 : ");
        String greeting = sc.nextLine();
        System.out.println(greeting);

        System.out.print("인사말을 입력해주세요 : ");
        String greeting2 = sc.next();
        System.out.println(greeting2);

    }
}
