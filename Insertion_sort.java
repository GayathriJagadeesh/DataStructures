package Sorting;
import java.util.Scanner;
public class Insertion_sort 
{
public static void main(String[] args) 
{
	int j;

	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the array size:");
	int size=scn.nextInt();
	int a[]=new int[size];
	int temp;
	System.out.println("Enter the elements:");
	for(int i=0;i<a.length;i++)
	{
		a[i]=scn.nextInt();
	}
	for (int i = 0; i < a.length; i++)
	{
		temp=a[i];
        j=i;
        while (j>0 &&a[j-1]>temp)
        {
            a[j]=a[j-1];
            j=j-1;        
        }
        a[j]=temp;
	}
	System.out.println("The sorted elements are:");
	for (int i = 0; i < a.length; i++)
	{
		System.out.print(a[i]+ " ");
	}
}
}
