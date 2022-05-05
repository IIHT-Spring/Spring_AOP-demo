package com.aop.aopconecpt.aspect;
import org.aspectj.lang.annotation.Aspect;

import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
	@Before("execution(* com.aop.aopconcept.services.PaymentServiceImpl.makePayment())")
	public void printBefore() {
		System.out.println("Payment Started...");
	}

}
