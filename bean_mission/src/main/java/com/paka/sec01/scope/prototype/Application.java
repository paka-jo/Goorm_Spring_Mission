package com.paka.sec01.scope.prototype;

import com.paka.common.Beverage;
import com.paka.common.Food;
import com.paka.common.Product;
import com.paka.common.ShoppingCart;
import com.paka.sec01.scope.singleton.ContextConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Application {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(ContextConfiguration.class);


        Product Kimbap = context.getBean("Kimbap", Food.class);
        Product Chicken = context.getBean("Chicken", Food.class);
        Product Coka = context.getBean("Coka", Beverage.class);
        Product Water = context.getBean("Water", Beverage.class);

        ShoppingCart cart1 = context.getBean("cart", ShoppingCart.class);
        cart1.addItem(Kimbap);
        cart1.addItem(Coka);

        System.out.println("cart1? : " + cart1.getItem());

        ShoppingCart cart2 = context.getBean("cart", ShoppingCart.class);
        cart2.addItem(Water);

        System.out.println("cart2? :" +cart2.getItem());

        System.out.println(cart1.hashCode());
        System.out.println(cart2.hashCode());
    }
}
