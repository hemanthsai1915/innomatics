package com.sai.innomatics;
import java.util.Scanner;
import java.io.*;
class NegativeNumberException extends Exception{
NegativeNumberException(String msg){
	super(msg);
}
}
public class Variables {
int a;
String name;
float b;
double c;
void display() throws IOException,NegativeNumberException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter name:");
	name=br.readLine();
	System.out.print("Enter integer value:");
	a=Integer.parseInt(br.readLine());
	if (a<0) {
        throw new NegativeNumberException("number cannot be negative");
	}
	System.out.print("Enter float value(ex:34.98):");
	b=sc.nextFloat();
	System.out.print("Enter double value(ex:23.098):");
	c=sc.nextDouble();
	System.out.println("This is coming from dislay method");
	System.out.println("my name is:"+ name);
	System.out.printf("Int: %d\nFloat: %f\nDouble:%.2f\n",a,b,c);

}

public static void main(String arg[]){
	while(true) {
	try{
	Variables v=new Variables();
	v.display();
	break;
	
	}
catch(IOException e) {
	System.out.println(e);
	
}
	catch(NegativeNumberException e) {
		System.out.print(e);
		System.out.println(" try again");
	}
	finally {
		System.out.println("exception handled");
	}
	}
	
}
}
