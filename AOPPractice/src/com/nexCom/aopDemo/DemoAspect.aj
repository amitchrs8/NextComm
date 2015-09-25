package com.nexCom.aopDemo;

public aspect DemoAspect {
	
	pointcut callAOPDemoPointCut() : 
		call(void com.nexCom.aopDemo.AOPDemo.method1(*));
	after() : callAOPDemoPointCut() {
		System.out.println(" Aspect Demo is called after method execution");
	}
	before() : callAOPDemoPointCut() {
		System.out.println(" Aspect Demo is called before method execution");
	}
}
