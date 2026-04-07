package com.sai.innomatics;

public class Demo {
	
	int a=10;
	static int b=30;
public static void m1() {
//	Demo obj=new Demo();
//	System.out.println(obj.a); --> not allowed to write normal variables in static method
	System.out.println(b);
}
public void m2() {
	System.out.println(a);
	System.out.println(b);//not suggested to write static variables in normal methods
}
public static void main(String arg[]) {
	Demo a1=new Demo();
	Demo.m1();
	a1.m2();
}
}
