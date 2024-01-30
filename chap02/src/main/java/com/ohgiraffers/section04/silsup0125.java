package com.ohgiraffers.section04;

public class silsup0125 {
    public static void main(String[] args) {
        int x = 20;
        int y = 30;
        System.out.println("더하기 결과 : "+(x+y));
        System.out.println("빼기 결과 : "+(x-y));
        System.out.println("곱하기 결과 : "+(x*y));
        System.out.println("나누기 결과 : "+(x/y));
        System.out.println("나누기 나머지의 결과 : "+(x%y));

        double x2 = 12.5;
        double y2 = 36.4;
        System.out.println("면적 : "+(x2*y2));
        System.out.println("면적 : "+((x2*2)+(y2*2)));

        char ch1 = 'a';
        System.out.println("문자 a의 아스키코드 : "+ (int)ch1);

        float fnum3 = 80.5f;
        float fnum4 = 50.6f;
        float fnum5 = 70.8f;

        System.out.println("총점 : "+(int)(fnum3+fnum4+fnum5));
        System.out.println("평균 : "+(int)(fnum3+fnum4+fnum5)/3);

    }
}
