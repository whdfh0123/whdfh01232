package com.hogiraffers.section02.looping;

import java.util.Scanner;

public class A_for {
    /*
    for 표현식
    for(초기식; 조건식 ; 증감식){
    조건을 만족하면 수행할 구문(반복할구문);
    }
     */
    public void simpleForStatement(){
        // 1부터 10까지 1씩 증가시키면서 i값을 출력하는 기본 반복문
    for(int i = 1; i <=10; i++){
        System.out.println(i);
    }

    }
    public void testForExample(){
        Scanner sc = new Scanner(System.in);
//        System.out.println("먹고 싶은 메뉴를 입력하세요 : ");
//        String menu1 = sc.nextLine();
//        System.out.println(menu1+"을 1순위로 먹고싶어요!");
//
//        System.out.println("먹고 싶은 메뉴를 입력하세요 : ");
//        String menu2 = sc.nextLine();
//        System.out.println(menu2+"을 2순위로 먹고싶어요!");
//
//        System.out.println("먹고 싶은 메뉴를 입력하세요 : ");
//        String menu3 = sc.nextLine();
//        System.out.println(menu3+"을 3순위로 먹고싶어요!");
//
//        System.out.println("먹고 싶은 메뉴를 입력하세요 : ");
//        String menu4 = sc.nextLine();
//        System.out.println(menu4+"을 4순위로 먹고싶어요!");
//
//        System.out.println("먹고 싶은 메뉴를 입력하세요 : ");
//        String menu5 = sc.nextLine();
//        System.out.println(menu5+"을 5순위로 먹고싶어요!");
//
//        System.out.println("먹고 싶은 메뉴를 입력하세요 : ");
//        String menu6 = sc.nextLine();
//        System.out.println(menu6+"을 6순위로 먹고싶어요!");
//
//        System.out.println("먹고 싶은 메뉴를 입력하세요 : ");
//        String menu7 = sc.nextLine();
//        System.out.println(menu7+"을 7순위로 먹고싶어요!");
//
//        System.out.println("먹고 싶은 메뉴를 입력하세요 : ");
//        String menu8 = sc.nextLine();
//        System.out.println(menu8+"을 8순위로 먹고싶어요!");
//
//        System.out.println("먹고 싶은 메뉴를 입력하세요 : ");
//        String menu9 = sc.nextLine();
//        System.out.println(menu9+"을 9순위로 먹고싶어요!");
//
//        System.out.println("먹고 싶은 메뉴를 입력하세요 : ");
//        String menu10 = sc.nextLine();
//        System.out.println(menu10+"을 10순위로 먹고싶어요!");
//        System.out.println("먹고싶은 메뉴가 많다 뭐먹지");

        for(int i = 1; i <= 10; i++){
            System.out.print("먹고싶은 메뉴를 입력하세요 :");
            String menu = sc.nextLine();
            System.out.println((menu+"를 "+i + "순위로 먹고싶어\n"));
        }
        System.out.println("먹고싶은 메뉴가 많다 뭐먹지");


    }
    public void testExample2(){
//        int num1 = 1;
//        int num2 = 2;
//        int num3 = 3;
//        int num4 = 4;
//        int num5 = 5;
//        int num6 = 6;
//        int sum = 0;
//        sum+=num1; // sum = sum+num1
//        sum+=num2;
//        sum+=num3;
//        sum+=num4;
//        sum+=num5;
//        sum+=num6;
//        System.out.println("누적은 : "+sum+"입니다");

        int sum2 = 0;
        for(int i = 1; i<=6; i++){
            sum2 +=i;
        }
            System.out.println("누적은 : "+sum2);
    }
    public void testForExample3(){
        int random = (int)(Math.random()*6)+5;
        System.out.println("random : "+random);
//        int sum = 0;
//        if(random == 5){
//            sum+=1;
//            sum+=2;
//            sum+=3;
//            sum+=4;
//            sum+=5;
//        }else if(random==6){
//            sum+=1;
//            sum+=2;
//            sum+=3;
//            sum+=4;
//            sum+=5;
//            sum+=6;
//        }else if(random==7) {
//            sum += 1;
//            sum += 2;
//            sum += 3;
//            sum += 4;
//            sum += 5;
//            sum += 6;
//            sum += 7;
//        }
//        else if(random==8){
//            sum+=1;
//            sum+=2;
//            sum+=3;
//            sum+=4;
//            sum+=5;
//            sum+=6;
//            sum+=7;
//            sum+=8;
//        }else if(random==9){
//            sum+=1;
//            sum+=2;
//            sum+=3;
//            sum+=4;
//            sum+=5;
//            sum+=6;
//            sum+=7;
//            sum+=8;
//            sum+=9;
//        }else {
//            sum+=1;
//            sum+=2;
//            sum+=3;
//            sum+=4;
//            sum+=5;
//            sum+=6;
//            sum+=7;
//            sum+=8;
//            sum+=9;
//            sum+=10;
//        }
        int sum2 = 0;
        for(int i= 1; i<=random;i++){
            sum2+=i;
        }
        System.out.println("1부터 "+random+"까지의 합은 : "+sum2);
    }
    public void testForExample4(){
        /*

       두 수의 합
       1, Scnner를 이용하여 두 개의 정수를 입력받는다
       (단, 2개의 숫자는 같지 않다는가정)
       2. 입력된 두 수 중 작은 수부터 큰 수까지의 합계를 구한다
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수 입력 : ");
        int firstNum = sc.nextInt();
        System.out.print("두 번째 정수 입력 : ");
        int secondNum = sc.nextInt();

        int sum = 0;
        if(firstNum>secondNum){
            for (int i = secondNum; i <= firstNum; i++){
                sum+=i;
            }
        }else {
            for(int i = firstNum; i<= secondNum; i++){
                sum+=i;
            }
        }
        System.out.println("sum : "+sum);

        int sum2 = 0;
        int min = Math.min(firstNum, secondNum);
        int max = Math.max(firstNum,secondNum);

        for(int i = max; i>=min; i--){
            sum2+=i;
        }
        System.out.println("sum2 = "+sum2);
    }
}
