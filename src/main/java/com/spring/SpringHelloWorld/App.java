package com.spring.SpringHelloWorld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.bean.HelloWorld;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext(
                "SpringBeans.xml");

        HelloWorld obj = (HelloWorld) context.getBean("rohitBean");
        obj.printHello();
        
//        System.out.println(obj);
        
        HelloWorld obj2 = (HelloWorld) context.getBean("karthikBean");
        obj2.printHello();
//        System.out.println(obj2);
    }
}
