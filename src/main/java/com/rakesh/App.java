package com.rakesh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
 /*       Car obj = (Car) context.getBean("car");
        obj.drive();
*/
/*        Tyre tyre = (Tyre) context.getBean("tyre");
        System.out.println(tyre);*/
    }
}
