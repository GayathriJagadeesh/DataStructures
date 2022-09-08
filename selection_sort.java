package Sorting;

public class selection_sort {
public static void main(String[] args) {
	int []arr= {34,52,84,65,15,12,45};
	int min;
	int temp=0;
	for (int i = 0; i < arr.length; i++) {
		min=i;
		for (int j = i+1; j < arr.length; j++) {
			if(arr[j]<arr[i]) {
				min=j;
			}
		
		}
	temp=arr[i];
	arr[i]=arr[min];
	arr[min]=temp;
		}
for (int i = 0; i < arr.length; i++) {
	System.out.println(arr[i]+ " ");
}	
}
}
