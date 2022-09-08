package Sorting;

import java.util.Scanner;

public class Bubble_sort {
public static void main(String[] args) {
	int temp;
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the array size");
	int size=scn.nextInt();
	int a[]=new int [size];
	
	System.out.println(" enter the elements:");
	for (int i = 0; i < a.length; i++)
	{
		a[i]=scn.nextInt();
		
	}
	for (int i = 0; i < a.length; i++)
	{
	
		for (int j=0;j<a.length-1;j++) 
		{	
		    
	
				if (a[j]>a[j+1])
			{
				
				temp= a[j];
				a[j]= a[j+1];
				a[j+1]=temp;
			}
		}
	}
	
	System.out.println("After sorting your elements will be:");
	for (int k = 0; k < a.length; k++)
	{
		System.out.print(a[k]+"   ");
		
	}
	
}
}
