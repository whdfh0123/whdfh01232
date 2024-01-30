package com.ohgiraffers.section01.method;

public class Application5 {
    public static void main(String[] args) {
        /*메소드 리턴에 대해 이해
        * return이란
        * 모든 메소드 내부에는 return; 이 존재
        * void 메소드의 경우 return; 을 명시적으로 작성하지 않아도 마지막줄에 컴파일러가 자동으로 추가
        * return;은 현재 메소드를 강제 종료하고 호출한 구문으로 돌아가는 명령어*/
        System.out.println("main() 시작");
        Application5 app5 = new Application5();
        app5.testMethod();

        System.out.println("main 종료");
    }
    public void testMethod(){
        System.out.println("testMethod() 동작 확인");
        System.out.println("tsetMethod() 동작확인2");
        return;

      //컴파일러에 자동추가 마지막에 작성

    }
}
