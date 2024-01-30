package com.ohgiraffers.section01.method;

public class Application9 {
    public static void main(String[] args) {
        //다른 클래스의 메소드 호출
        int first = 100;
        int second = 50;

        //non-스태틱 메소드의 경우 클래스가 달라도 사용방법 동일
        //클래스명 사용할이름 = new 클래스명(); //클래스명은 메소드가 저장된 클래스
        //사용할이름.메소드명();

        Calculator cale = new Calculator();
        int min = cale.minNumber(first,second);
        System.out.println("두 수 중 최소값은 : "+min);

        /*static 메소드의 경우
        * 다른 클래스에 작성한 static 메소드는 호출할 때 클래스명을 반드시 기술
        * 클래스명.메소드명();*/

//        int max= maxNumber(first, second);  클래스명 있어야함
        int max= Calculator.maxNumber(first, second);
        System.out.println("최대값은 : "+max);

        int max2 = cale.maxNumber(first,second); //클래스 없으면 오류 확률있음(권장X) 실행은 가능


    }
}
