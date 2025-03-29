package com.paka.properties;

import com.paka.common.Beverage;
import com.paka.common.Food;
import com.paka.common.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration  // 빈 생성하고 관리
@PropertySource("info.properties") // 프로퍼티 파일에서 정보를 가져옴
public class ContextConfiguration {

    @Value("${bread.carpbread.name}") // 해당 키의 값을 불러와  bean 클래스에 주입
    private String carpBreadName;

    @Value("${bread.carpbread.price:0}") //기본값을 0이라고 설정함 프로퍼티스의 정보가 덮어쓸거임
    private int carpBreadPrice;

    @Value("${beverage.milk.name}")
    private String milkName;

    @Value("${beverage.milk.price:0}")
    private int milkPrice;

    @Value("${verage.milk.capacity:0}") //
    private int milkCapacity;

    @Bean // 빈에 내용주입
    public Product carpBread() {

        return new Food(carpBreadName, carpBreadPrice, new java.util.Date()); // Food에 대한 내용 가져오기

    }

    @Bean
    public Product milk() {

        return new Beverage(milkName, milkPrice, milkCapacity);
    }

    @Bean
    public Product water(@Value("${beverage.water.name}") String waterName,
                         @Value("${beverage.water.price:0}") int waterPrice,
                         @Value("${beverage.water.capacity:0}") int waterCapacity) {

        return new Beverage(waterName, waterPrice, waterCapacity);


    }
}
