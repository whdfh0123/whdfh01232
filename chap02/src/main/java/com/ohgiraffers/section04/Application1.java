package com.ohgiraffers.section04;

public class Application1 {
    public static void main(String[] args) {
        /* 비교연산자
        비교연산자는 피연선산자 사이에 상대적인 긐연사자
        조건식이나 조건문에 더 많ㅇ습ㄴㄷ
         */ /*왼쪽의 피연산자와 오른쪽의 피연산자가 같으면 true 다르면 false를 반환
       == 왼쪽의 피연산자와 오른쪽의 피연산자가 같으면 true  false를 반환
       != 왼쪽의 피연산자와 오른쪽의 피연산자가 같으면 true 다르면 false를 반환
       ...*/


        int inum1 = 10;
        int inum2 = 20;
        System.out.println("정수값비교");
        System.out.println(inum1==inum2);
        System.out.println(inum1!=inum2);
        System.out.println(inum1 >inum2);
        System.out.println(inum1<inum2);
        System.out.println(inum1<=inum2);
        System.out.println(inum1>=inum2);

        System.out.println("문자값 비교");
        char ch1 = 'a'; //97
        char ch2 = 'A'; //65
        System.out.println("ch1 과 ch2가 같은지 비교 : " +(ch1==ch2));
        System.out.println("ch1과 ch2가 같지 않은지 비교 : " +(ch1!=ch2));
        System.out.println("ch1 과 ch2중 2가 큰지 비교 : " +(ch1<ch2));

        //논리값과 문자열은 == or != 까지만 비교가 가능하다
        boolean bool = true;
        boolean bool2 = false;

        System.out.println("논리비교 " +(bool2== bool));

        String str1 = "java";
        String str2 = "java";
        System.out.println(str1==str2);
        System.out.println(str1!=str2);
//        System.out.println(str1<str2);

        int x =10;
        int y = 20;
        boolean result = x<=y;
        System.out.println("xy비교" + result);


    }
}
