package com.aop.aopconecpt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.aopconcept.services.PaymentService;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/aop/aopconecpt/config.xml");
    
    	PaymentService paymentObject = context.getBean("payment", PaymentService.class);
    	
    	
    	paymentObject.makePayment(); // join point 
    }
}
