package com.ohgiraffers.section01.method;

public class Application3 {
    public static void main(String[] args) {
        /*
        전달인자와 매개변수를 이용한 메소드호풀

        변수의 종류
        1. 지역변수
        2. 매개변수
        3. 전역변수
        4. 클래스변수
        지역변수는 선언한 메소드 블럭 내부에서만 사용 가능하다 이것을 지역변수의 스코프
        라고 한다 다른 메소드간 공유해야 하는 값이 존재하는 경우 메소드 호출 시 사용하는 괄호를 이용해서
        전달할 수 았는데 전달하는 값을 전달인자, 메소드 선언부 괄호 안에
        전달인자를 받기 위해 선언하는 변수는 매개변수
         */
        Application3 app3 = new Application3();
        app3.testMethod(40);
//        app3.testMethod("40");          int에 들어가야 해서 오류 (""문자라) (int age에 들어가야한다)
//        app3.testMethod(40,20,30);      갯수가 맞지않아 오류
//        app3.testMethod();              빈칸이라 오류
        int age2 = 20;   //밑에 age랑 이름 달라도 상관X
        app3.testMethod(age2);

        byte byteage = 10;
        app3.testMethod(byteage);

        long longAge = 60;
//        app3.testMethod(longAge);   >>위의 byte형은 자도형변환 큰 자료형이라 오류 형변환시키기
        app3.testMethod((int)longAge); // 강제형변환
        app3.testMethod(age2*4);
    }
    public void testMethod(int age){
        System.out.println("당신의 나이는 " + age + "살");

    }
}
