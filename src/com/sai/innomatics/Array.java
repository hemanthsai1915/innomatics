package com.sai.innomatics;
import java.util.Scanner;
public class Array {
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.print("enter array size:");
	int n=sc.nextInt();
 int[] arr=new int[n];
 System.out.printf("Enter %d integer elemnts:\n",n);
 for(int i=0;i<n;i++)
 {
	 arr[i]=sc.nextInt();
 }
 for(int i=0;i<arr.length;i++)
 {
	 System.out.println(arr[i]);
 }
}
}
