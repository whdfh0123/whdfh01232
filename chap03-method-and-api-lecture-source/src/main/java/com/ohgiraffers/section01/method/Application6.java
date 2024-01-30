package com.ohgiraffers.section01.method;

public class Application6 {
    public static void main(String[] args) {
        /*메소드는 항상 마지막에 리턴명령어 존재
        return 은 자신을 호출한 구무능로 복고ㅢ

        반환값이 럾으면 생략
        반환값이 있으면 반드시 작성
        또한 메소드 선언부에 선언한 리턴타입 반환값의 자료형은 일치
         */
        System.out.println("main()시작");
        Application6 app6 = new Application6();
        app6.testMethod(); //출력 명령어가 없으면 출력은 하ㅣ 않음
        String returnText = app6.testMethod(); //값 넣기
        System.out.println(returnText);
        System.out.println(app6.testMethod()); //다른 방식으로 한번에 호출

    }
    public String testMethod(){
        //public 뒤에 바로 return으로 가지고 갈 타입을 명시
        //아무 값도 리턴하지 않는 경우 void
        //값을 반환하는 경우엔 반환값의 자료형 작성
        return "hrllo World";
    }
}
