import java.util.*;


class Node	
{
     Node next;
     //int size;
     int data;
     public Node(int data) 
     {
        this.data = data;
        this.next = null;
     }
}
public class Linked_List 
     {
     	Node head=null;
     	Node tail=null;
     	int size;
     	//Node currentnode=null;
     	//int size=0;
     public Linked_List() {
    	 this.size=0;
     }
     public int size() {
    	 return size;
     }
        public void addFirst(int data) 
        {
        	Node node = new Node( data);
         
        if(size==0) 
        {
        	head=node;
        	//return;
        }
        else if (size>0) {
        	tail.next=node;
        }
        
        tail=node;
        size++;
    }
//        public void addLast(int data) {
//        	Node nd=new Node(data);
//        	if(head==null) {
//        		head=nd;
//        		return;
//        	}
//        	else {
//        		Node currentNode=head;
//        		
//        	while(currentNode.next!=null) {
//        			currentNode=currentNode.next;
//        	}
//        	size++;
//        	currentNode.next=nd;
//        }
//        }
        
        public void deleteFirst(int data) {
        	Node nd=new Node(data);
        	if(head==null) {
        		System.out.println("Empty");
        		head=nd;
        		return;
        	}
        	size--;
        	head=head.next;
        	
        }
        public void deleteLast(int data) {
        	Node nd=new Node(data);
        	if(head==null) {
        		System.out.println("Empty");
        		//tail=nd;
        		return;
        	}
        	if(head.next==null) {
        		head=null;
        		return;
        		}
        	Node secondLast=head;
        	Node lastNode=head.next;
        	while(lastNode.next !=null) {
        		lastNode=lastNode.next;
        		secondLast=secondLast.next;
        	}
        	size--;
        	secondLast.next=null;
        }
        public void gethead(int data) {
        	Node nd=new Node(data);
        	if(head==null)
        	{
        	head=nd;
        	return;
        	}
        	else {
        		Node currentNode=head;
        	}
        }
        
 public void display() {
	 if(head==null) {
		 System.out.println("Empty");
		 return;
	 }
	 Node currentNode=head;
	 while(currentNode!=null) {
		 System.out.print(currentNode.data+ "->");
		 currentNode=currentNode.next;
	 }
	 System.out.println("Null");
 }

	public static void main(String[] args) {
		Linked_List LL=new Linked_List();
		LL.addFirst(25);
		LL.addFirst(26);
		LL.addFirst(27);
		LL.addFirst(28);
	//	LL.deleteFirst(0);
		//LL.deleteLast(0);
		
		System.out.println(LL.size());
		
		//System.out.println(LL.gethead());
		LL.display();
		
	}
}
