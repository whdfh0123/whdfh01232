package com.ohgiraffers.section03.increment;

public class Application {
    public static void main(String[] args) {
        /*
        증감연산자
        피연산자의 앞 or 뒤에ㅔ 사용가능
        ++은 1 증가
        --는 1 감소


         */
        int num = 20;
        System.out.println("num : "+num);

        num++;
        System.out.println("num : "+num);
        ++num;
        System.out.println("num : "+num);
        num--;
        System.out.println("num : "+num);
        --num;
        System.out.println("num : "+num);
        /*증감연산자는 다른연산자와 함께 사용할 때 의미가 다른
        var++ : 다른 연산을 먼저 하고 나중에 증가
        ++var : 먼저 1 증가 후 다른 연산
        var-- : 다른 연산 후 빼기
        --var : 다른 연산보다 먼저 빼기
         */
        int firstNum = 20;
        int result1 = firstNum++ * 3;//증감이 늦어서 답은 60
        System.out.println(result1);
        System.out.println(firstNum);

        int firstNum2 = 20;
        int result2 = ++firstNum * 3;//증감이 늦어서 답은 60
        System.out.println(result2);
        System.out.println(firstNum2);

        int num1 = 10;
        int addNum = num1;
        System.out.println(addNum);
        System.out.println(num1);






    }
}
