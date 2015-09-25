package com.nexCom.aopDemo;

public class AOPDemo {
	

	public void method1(int a){
		System.out.println(" executing method1 with arg "+a);
	}
	
	public void method1(int a,String b){
		System.out.println(" executing method1 with multiple arga "+a+ " and : "+b);
	}

	public void method2(int a){
		System.out.println(" executing method2 with arg "+a);
	}

	public static void main(String[] args) {
		AOPDemo obj = new AOPDemo();
		obj.method1(2);
		obj.method1(4, "four value");
		obj.method2(5);
	}
	

	
	
	
}
