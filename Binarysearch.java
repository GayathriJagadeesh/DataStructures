import java.util.Scanner;

public class Binarysearch {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("array size");
		int size=scn.nextInt();
		int[ ]arr=new int [size];
		
		System.out.println("Enter your array elements");
		for (int i = 0; i < arr.length; i++)
		{
			arr[i]=scn.nextInt();
		}
		System.out.println("your array elements are:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		// bubble sort
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length-1; j++) {
			if	(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		System.out.println();
		System.out.println("Sorted element:");
		for (int k = 0; k < arr.length; k++) {
			System.out.print(arr[k]+ " ");
		}
		System.out.println(
				);
		System.out.println("element to be searched");
		int val=scn.nextInt();
		
		
		//int arr[] = { 5,6,7,8,9};
		//int val = 9;
		boolean iselementfound = false;
		int low = 0;
		int high = arr.length;
		int mid;
		while (low <= high && !iselementfound) {
			mid = (low + high) / 2;
			if (arr[mid] == val) {
				iselementfound = true;
				System.out.println("the element is found in " + mid);
				break;

			} else if (arr[mid] < val) {
				low = mid + 1;

			}

			else {
				high = mid - 1;
			}

			mid = (low + high) / 2;

		}
		if (!iselementfound) {
			System.out.println("element not found");
		}
	}
}
