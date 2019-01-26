package com.tastycai;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOC {


    @Test
    public void testIOC1(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        String[] names = applicationContext.getBeanDefinitionNames();

        for (int i=0;i<names.length;i++){

            System.out.println(names[i]);
        }

    }
}
