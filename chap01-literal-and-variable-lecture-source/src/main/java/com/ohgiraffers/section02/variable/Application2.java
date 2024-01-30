package com.ohgiraffers.section02.variable;

public class Application2 {
    public static void main(String[] args) {
        //변수 사용법
        /*변수를 준비한다
        변수에 값을 대입한다
        변수를 사용한다

        자료형 변수명;

        자료형이란
        다양한 값의 형태별로 어느 정도 크기를 하나의 값으로 취급할 것 인지 미리 compiler와 약속한 키워드이다
        예 ) 앞에서 사용한 int 자료형은 정수를 4byte 만큼 읽어서 하나의 값으로 취급하겠다는 약속이다
        이러한 자료형은 기본자료형과 참조자료형으로 나누어진다
        그 중 기본자료형 8가지
        정수를 취급하는 자료형은 4가지가 있다
        byte bnum; 1바이트
        short snum 2바이트
        int inum  4바이트
        lonh lnum;8바이트

        실수를 취급하는 자료형은 두개
        float
        double
        문자는 한가지
        char
        논리값을 취급하는 것
        boolean

         */
        char ch= 'a';
        String str;
        str ="안녕하세요";
        /* 숫자로 된 형태의 값을 그대로 사용하는 자료형은 byte, short, int 애ㅕㅠㅣㄷdlek
        일반적으로 사용하는 값을 독특한 형태가 아닌 일반적인 형태로 사용할 수 있는 자료형을
        대표자료형이라고 하며
        정수형은 int, 실수형은 double이 대표 자료형이다
         */
        int point = 100;
        int bonus =10;
        System.out.println("=========변수에 저장 된 값 출력");
        System.out.println("point의 값 : "+point);
        System.out.println("bonus의 값 : "+bonus);

        System.out.println("포인트와 보너스의 합은? "+(point+ bonus));

        point = point +100;
        System.out.println("point = point + 100? "+ point);

    }
}
