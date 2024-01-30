package com.ohgiraffers.section01.method;

public class Application7 {
    public static void main(String[] args) {
        /*매개변수와 리턴값 복합 활용*/
        int first1 = 20;
        int second2 = 10; //변수명 밑에 매소드랑 같아도 달라도 상관없음
        Application7 app7 = new Application7(); //객체 생성
        System.out.println("더하기" + app7.plusTwoNumbers(first1,second2));
        System.out.println("빼기 : "+app7.minusTwoNumbers(first1,second2));
        System.out.println("곱하기" +app7.multipleTwoNumbers(first1,second2));
        System.out.println("나누기"+ app7.divideTwoNumbers(first1, second2));
    }
    public int plusTwoNumbers(int first, int second){
        return first + second;
    }
    public int minusTwoNumbers(int first, int second){
        return first - second;

    }
    public int multipleTwoNumbers(int first, int second) {
        return first * second;
    }
    public int divideTwoNumbers(int first, int second) {
        return first / second;
    }
}
