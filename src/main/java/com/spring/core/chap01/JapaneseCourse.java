package com.spring.core.chap01;

public class JapaneseCourse implements Course{
    @Override
    public void combineMenu() {
        System.out.println("--- 오마카세 메뉴 구성 ---");
        System.out.println("1. 일식 계란찜");
        System.out.println("2. 청어알초밥");
        System.out.println("3. 제철생선초밥");
        System.out.println("4. 숙성농어초밥");
        System.out.println("5. 장어초밥");
        System.out.println("6. 계란초밥");
        System.out.println("7. 바닐라 아이스크림");
    }
}
