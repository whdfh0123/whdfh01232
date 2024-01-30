package com.ohgiraffers.section01.method;

public class silsup0129 {
    public static void main(String[] args) {
        int ki = 120;
        char ad= 'y';
        String good = (ki>=130&&ad=='y')?"탑승 가능":
                (ki>=130&&ad=='n')?"보호자필요 탑승불가":
                        (ki<130&&ad=='y')?"신장미달":
                                (ki<130&&ad=='n')?"모두 불충족": "뭐지";


    }
}
