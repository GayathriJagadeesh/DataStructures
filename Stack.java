
public class Stack {
	int top;
	String[] arr;
	int size;

	public Stack() {
		top = -1;
		size = 15;
		arr = new String[15];

	}

	public Stack(int size) { // parameterized constructor for the user/
		int top = -1;
		arr = new String[size];
		// arr = new String[10];

		this.size = size;
	}

	public boolean push(String str) {
		if (isEmpty()) {
			top = top + 1;
			arr[top] = str;
			return true;
		} else {
			if (!isFull()) {
				top = top + 1;
				arr[top] = str;
				return true;
			} else {
				System.out.println("The Stack is full!");
			}

		}
		return false;

	}

	public boolean isFull() {
		if (top < size) {
			return false;// returns false if stack is not full
		} else {
			return true;
		}
	}

	public boolean isEmpty() {
		if (top == -1) {
			return true;
		} else {
			if (size > top) {
				return false;
			} else {
				return true;
			}
		}
	}

	public String pop() {
		if (!isEmpty()) {
			String value;
			value = arr[top];
			top = top - 1;
			return value;
		}
		return null;
	}

	public String peek() {
		if (top == -1) {
			System.out.println("Stack is empty.");
			return null;
		} else {
			String value = arr[top];
			System.out.println("Stack is not Empty.");
			return value;
		}

	}

}
