package com.ohgiraffers.section06.tenary;

public class Application1 {
    public static void main(String[] args) {
        /*삼항 연산자
        자바에서 유일하게 피연산자 항목이 3개이다
        (조건식) ? 참일경우 출력물 : 거짓경우 출력물


         */
        //삼항연산자 단독 사용
        int num1 = 10;
        int num2 = -10;
        String result1 = (num1 > 0) ? "양수" : "음수";
        System.out.println(result1);
        String result2 = (num2 > 0) ? "양수" : "음수";
        System.out.println(result2);

        //삼항연산자 중첩 사용
        int n3 = 5;
        int n4 = 0;
        int n5 = -5;
            //>> 참이면 양수다                 >>거짓이면 뒤에꺼 연산 >> 다시 참 거짓 판별 후 출력
        String result3 = (n3 > 0) ? "양수다" : (n3 == 0) ? "이건 0이야" : "음수다";
        String result4 = (n4 > 0) ? "양수다" : (n4 == 0) ? "이건 0이야" : "음수다";
        String result5 = (n5 > 0) ? "양수다" : (n5 == 0) ? "이건 0이야" : "음수다";
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);


    }
}
