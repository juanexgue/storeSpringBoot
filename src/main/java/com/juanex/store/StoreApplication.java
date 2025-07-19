package com.juanex.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {
        //SpringApplication.run(StoreApplication.class, args);
        ApplicationContext ctx = SpringApplication.run(StoreApplication.class, args);
        var orderService = ctx.getBean("orderService", OrderService.class);
        orderService.placeOrder();
    }

}
