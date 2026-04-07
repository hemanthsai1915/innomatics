package com.sai.innomatics;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class bookMyShow {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter movie name:");
		System.out.println("Doomsday 2.Dune 3.Spiderman");
		String mv=sc.next();
		ServiceProvider r=new ServiceProvider();
		Movie m;
		m=r.getMovie(mv);
		m.selectTheatre();
		try {
		FileOutputStream f=new FileOutputStream("objectdata.ser");
		ObjectOutputStream oos = new ObjectOutputStream(f);
		oos.writeObject(m);
		oos.close();
		}
		catch(Exception e)
		{
		}
}
}