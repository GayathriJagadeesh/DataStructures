
public class Stack1 {
public static void main(String[] args) {
	Stack st = new Stack();
	/*;
	st.push("name2");
	st.push("name3");
	st.push("name4");
	st.push("name5");*/
	System.out.println(st.push("name1"));
	System.out.println(st.push("name2"));
	System.out.println(st.push("name3"));
	System.out.println(st.push("name4"));
	System.out.println(st.push("name5"));
	System.out.println(st.pop());
	System.out.println(st.peek());
	System.out.println(st.isEmpty());
	System.out.println(st.isFull());
	System.out.println(st.size);
}
}
