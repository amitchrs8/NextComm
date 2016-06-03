package com.nexCom.aopDemo;

import org.aspectj.lang.annotation.AfterReturning;

public aspect DemoAspect {
	
	pointcut callAOPDemoPointCut() : 
		call(void com.nexCom.aopDemo.AOPDemo.method1(*));
	after() : callAOPDemoPointCut() {
		System.out.println(" Aspect Demo is called after method execution");
	}
	
	before() : callAOPDemoPointCut() {
		System.out.println(" Aspect Demo is called before method execution");
	}
	
	pointcut callAOPDemoPointCut2() : 
		call(void com.nexCom.aopDemo.AOPDemo.method2(*));
	after() : callAOPDemoPointCut2() {
		System.out.println(" Aspect Demo 2 is called after method execution");
	}
	before() : callAOPDemoPointCut2() {
		System.out.println(" Aspect Demo 2 is called before method execution");
	}
	

	
	pointcut callSum() : 
		call(int com.nexCom.aopDemo.AOPDemo.sum(*,*));

	after() : callSum() {
		System.out.println(" callSum is called after method execution");
	}
//	around() : callSum() {
//		System.out.println("callSum around is called");
//		return callSum.proceed(new Integer(54));
//	}
	before() : callSum() {
		System.out.println(" callSum is called before method execution");
	}

	 after() returning(int a) : callSum() {
	System.out.println("return from method call is "+a);
	a=12;
	System.out.println("Changing the final return");
	}
	
	
	
	
}
