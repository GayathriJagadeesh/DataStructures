import java.util.Scanner;

public class Linearsearch {
public static void main(String[] args) {
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter array size");
	int size=scn.nextInt();
	int[ ]arr=new int [size];
	System.out.println("elements");
	for (int i = 0; i < arr.length; i++) {
		arr[i]=scn.nextInt();
	}
	System.out.println("Enter the element:");
	int num=scn.nextInt();
	for (int  i= 0; i < arr.length;i ++) {
		if(arr[i]==num) {
			System.out.println("the element is in :"+i +" index position");
		}
	}
}
}
