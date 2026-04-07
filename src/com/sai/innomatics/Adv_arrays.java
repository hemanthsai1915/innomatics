package com.sai.innomatics;
import java.util.*;
public class Adv_arrays {
public static void main(String arg[]) {
Scanner sc=new Scanner(System.in);
System.out.print("Enter array values space seperated:");
String a=sc.nextLine();
String[] parts=a.split(" ");

ArrayList<Integer> list=new ArrayList<>();
for(String p:parts)
{
	list.add(Integer.parseInt(p));
}
System.out.println(list);
}
}

