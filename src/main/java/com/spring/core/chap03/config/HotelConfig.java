package com.spring.core.chap03.config;

import com.spring.core.chap03.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// HotelConfig클래스가 주입에 필요한 객체들을 관리할것임을 명시
@Configuration
public class HotelConfig {

    // 빈 등록 : 스프링이 관리할 객체를 알려주는 작업
    // 방법 : @Bean 어노테이션을 객체생성코드위에 붙여줌
    @Bean
    public Chef chef(){
        return new KoreanChef(); // 스프링컨테이너(힙)에 KoreanChef라는 객체 생성
    }

    @Bean
    public Course koreanCourse(){
        return new KoreanCourse(); // 스프링컨테이너(힙)에 KoreanCourse라는 객체 생성
    }

    @Bean
    public Restaurant restaurant(){
        return new FusionRestaurant(chef(), koreanCourse());
    } // 스프링컨테이너(힙)에
    // FusionRestaurant(KoreanChef->chef(), KoreanCourse->koreanCourse())라는 객체 생성

    @Bean
    public Hotel hotel(){
        return new Hotel(restaurant(), chef());
    } // 스프링컨테이너(힙)에
    // Hotel(FusionRestaurant->restaurant(), KoreanChef->chef()) 객체 생성

}
