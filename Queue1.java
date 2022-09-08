import java.util.Scanner;

public class Queue1 {
public static void main(String[] args) {
	/*Scanner scn=new Scanner(System.in);
	System.out.println("Enter Queue size:");
	int size=scn.nextInt();*/
	Queue Q=new Queue(10);
	
    Q.add("black");
	Q.add("blue");
	Q.add("brown");
	Q.add("red");
	Q.display();
	
	
	System.out.println(Q.isFull());
	System.out.println(Q.isEmpty());
}
}
