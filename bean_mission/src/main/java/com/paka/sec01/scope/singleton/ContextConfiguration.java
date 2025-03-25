package com.paka.sec01.scope.singleton;

import com.paka.common.Beverage;
import com.paka.common.Food;
import com.paka.common.Product;
import com.paka.common.ShoppingCart;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ContextConfiguration {

    @Bean
    public Product Kimbap() {

        return new Food("삼각김밥", 1800, new java.util.Date());
    }

    @Bean
    public Product Chicken() {

        return new Food("양념치킨", 18000, new java.util.Date());
    }

    @Bean
    public Product Coka() {

        return new Beverage("코카콜라", 1500, 300);
    }

    @Bean
    public Product Water() {

        return new Beverage("삼다수", 3000, 500);

    }

    @Bean
    @Scope("singleton")
    public ShoppingCart cart() {

        return new ShoppingCart();
    }
}
