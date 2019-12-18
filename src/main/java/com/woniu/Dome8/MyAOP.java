package com.woniu.Dome8;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAOP {

	public void before() {
		System.out.println("MyAOP.before");
	}
	public void afterReturning() {
		System.out.println("MyAOP.afterReturning");
	}
	public Object around(ProceedingJoinPoint pjp) {
		System.out.println("MyAOP.around");
		try {
			Object obj = pjp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pjp;
		
	}
	public void afterThrowing() {
		System.out.println("MyAOP.afterThrowing");
	}
	public void after() {
		System.out.println("MyAOP.after");
	}
}
