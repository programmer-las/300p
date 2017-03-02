package com.svlugovoy.youtube300plus.q328_log4j;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * Created by Sergey on 14.12.2015.
 */
public class Log4jExample {
    public static void main(String[] args) {
        OrderLogic logic = new OrderLogic();
        logic.doOrder();
    }
}

class OrderLogic {
    private static final Logger log = Logger.getLogger(OrderLogic.class);

    public void doOrder() {
        // какае-то логика
        System.out.println("Заказ оформлен!");
        // логируем инфо
        log.info("Это информационное сообщение!");
        addToCart();
    }

    private void addToCart() {
        // добавление товара в корзину
        System.out.println("Товар добавлен в корзину");
        // логируем ошибку
        log.error("Это сообщение ошибки");
    }
}