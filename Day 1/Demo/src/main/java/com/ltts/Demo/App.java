package com.ltts.Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new ClassPathXmlApplicationContext("bean.xml");
    Employee e=	(Employee) context.getBean("emp");
    Employee f=	(Employee) context.getBean("emp1");

        System.out.println(e);
        System.out.println(f);
        

    }
}
