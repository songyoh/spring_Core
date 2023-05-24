package com.spring.core.chap04;

import org.springframework.stereotype.Component;

@Component("cco")
public class ChineseCourse implements Course {
    @Override
    public void combineMenu() {
        System.out.println("--- 중식 코스 메뉴 구성 ---");
        System.out.println("1. 홍게 샐러드");
        System.out.println("2. 냉체");
        System.out.println("3. 황금계란볶음밥");
        System.out.println("4. 가지튀김");
        System.out.println("5. 중식볶음면");
        System.out.println("6. 페킹 덕");
        System.out.println("7. 공갈빵 아이스크림");
    }
}
