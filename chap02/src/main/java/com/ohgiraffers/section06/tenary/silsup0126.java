package com.ohgiraffers.section06.tenary;

public class silsup0126 {
    public static void main(String[] args) {
        // 선생님이 내주신 오늘의 실습문제
        //1번
        int num1 = 10;
        int num2 = 20;

        String gg = (num1 < num2) ? "두 수 중 큰 수는" + num2 + "입니다." : "두 수 중 큰 수는" + num1 + "입니다.";
        System.out.println(gg);
        //1번의 다른 풀이
        int ggnum1 = (num1 < num2) ? num2 : num1;
        System.out.println("다음 중 큰 수는 " + ggnum1);

        //2번

        int num21 = 61;
        int num22 = 10;
        String gg2 = (num21 >= 60) ? "합격입니다" : "불합격 입니다";
        System.out.println(gg2);

        //3번

        int num31 = 9;
        String gg3 = (num31 % 2 == 0) ? "짝수입니다" : "홀수입니다";
        System.out.println(gg3 +"\n");

        //4번

        double num41 = 90.1;
        String gg4 = ((int)num41 >= 90) ? "A" :
                ((int)num41 >= 80) ? "B" :
                ((int)num41 >= 70) ? "C" :
                        ((int)num41 >= 60) ? "D;" : "F";
        System.out.println("000님의 점수등급은 " + gg4 + "입니다.\n");

        //5번

        int num51 = 4;
        int num52 = 8;

        String gg5 = ((1<=num51 && num51<=6)&&(1<=num52 && num52 <= 15)) ? "배민 쿠폰" :
                ((7<=num51 && num51 <=12)&&(16<=num52 && num52 <= 31)) ? "스타벅스 쿠폰" : "사탕";
        System.out.println("000님의 쿠폰은 " + gg5 + "입니다");

        //5번의 다른 풀이 -> 그냥 월, 일을 정상적인 범위 안에 입력했다는 가정 하에 정확한 값 생략
        String gg522 = (num51>=6 && num52 <= 15) ? "배민 쿠폰" :
                (7<=num51 && num52 <= 31) ? "스타벅스 쿠폰" : "사탕";
        System.out.println("000님의 쿠폰은 " + gg522 + "입니다");

        //내가 만든 문제
        /*정수형 문제를 2개 선언하여 저장합니다(월, 일)
        월이 1월부터 6월, 일이 1~15일에 해당한다면 '20%쿠폰',
        1~6월이고 16~31일에 해당한다면 '30%쿠폰' ,
        7월~12월, 1~15일에 해당한다면 '10%쿠폰' ,
        7월~12월, 16~31일에 해당한다면 '40%쿠폰'을 발급하고
        매월 9일에는 '2+1' 쿠폰을 발급하는 프로그램을 작성해주세요
         */
        int m = 1;
        int d = 9;
        String cupon = ((1<=m && m<=6)&&(1<=d && d<=15)) ? "20%쿠폰" :
                ((1<=m && m<=6)&&(15<=d && d<=31)) ? "30%쿠폰" :
                        ((7<=m && m<=12)&&(1<=d && d<=15)) ? "10%쿠폰" :
                                ((7<=m && m<=12)&&(15<=d && d<=31)) ? "40%쿠폰" : "날짜를 다시 입력해주세요";
                                 //       ((1<=m && m<=12 && d==9)) ? "2+1쿠폰" : "날짜를 다시 입력해주세요";
        System.out.println("오늘의 쿠폰은 : " + cupon);

        int apple = 23;
        int box;
        String g8 = ((apple/5 == 0)&&(apple <= 10)) ? "2" : "2";
        System.out.println(g8);

        int inum = 0;
        String num = (inum>0) ? "양수입니다" :
                (inum<0) ? "음수입니다" : "입력하신 숫자는 0입니다";
        System.out.println(num);




    }
}
