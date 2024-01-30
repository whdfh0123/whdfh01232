package com.ohgiraffers.section01.method;

public class Application4 {
    public static void main(String[] args) {
        /*여러 개의 전달인자를 이용한 메소드 호출 테스트*/
        Application4 app4 = new Application4();
        app4.testMathod("000", 20, '남');
//        app4.testMathod(20, "ㅇ", '1'); 순서도 맞춰서 입력해야한다
        String name = "111";
        int age = 21;
        char gender = '여';
        char gender2 = '남';
        app4.testMathod(name,age,gender); //순서 갯수 맞추기
        app4.testMathod(name,age,gender2); //순서 갯수 맞추기
    }
    public void testMathod(String name, int age, final char gender){
        /*매개변수도 일종의 지역변수로 분류된다
        지역변수에 final키워드를 붙여 상수를 만드는 것과 동일
        final 먀개변수는 상수 네이밍 규칙을 따르는건 선택이다
         */
        age = 1;
//        gender = '중';
        name = "333";
        System.out.println("당신의 이름은 "+name+"이고, 나이는 "+age+"세 이며, 성별은 "+gender+"입니다");
    }
}
