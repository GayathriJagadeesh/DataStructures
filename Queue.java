
public class Queue {
	int front;
	String[] arr;
	int size;
	int rear;

	public Queue(int size) {
		int front = rear = 0;
		arr = new String[size];
		this.size = size;
	}

	public String add(String value) {
		if (size == rear) {
			System.out.println("Queue is not Empty.");
			return null;

		}
		// System.out.println("The Queue is empty");
		else {

			arr[rear] = value;
			rear++;
			return value;

		}
	}

	public String pop(String value) {

		if (!isEmpty()) {
			for (int i = 0; i < rear; i++) {
				arr[i] = arr[i + 1];
			}
			if (rear < size) {
				arr[rear] = null;
				rear--;
			}
		}
		return value;
	}

	public boolean isFull() {
		if (size != rear) {
			System.out.println("The Queue is not full.");
		}

		else if (size == rear) {
			System.out.println("The Queue is full.");

		}

		return true;
	}

	public void display() {
		if (isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		for (int i = front; i < rear; i++) {
			System.out.println(arr[i] + " ");
		}
	}

	public boolean isEmpty() {
		if(size==rear) {
			System.out.println("The Queue is not Empty");
		}
		else {
			System.out.println("The Queue is Empty");
		}
		return false;
	}
}
