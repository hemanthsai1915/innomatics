package com.sai.innomatics;

public class Inheritance extends A{

    public Inheritance(int a,int b) {
        super(a,b); // calling parent constructor
    }
	public static void main(String arg[]) {
		Inheritance a=new Inheritance(10,20);
		a.display();
	}

}
