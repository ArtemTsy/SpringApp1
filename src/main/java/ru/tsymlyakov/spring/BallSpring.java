package ru.tsymlyakov.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BallSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        BallBean ballBean = context.getBean("ballBean", BallBean.class);

        System.out.println(ballBean.getName());

        context.close();
    }
}
