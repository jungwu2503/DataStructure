
public class MyQueue {

	private static int front, rear, capacity;
	private static int queue[];
	
	MyQueue(int size) {
		front = rear = 0;
		capacity = size;
		queue = new int[capacity];
	}
	
	static void queueEnqueue(int item) {
		if (capacity == rear) {
			System.out.println("\nQueue is full");
			return;
		}
		else {
			queue[rear] = item;
			rear++;
		}
		return;
	}
	
	static void queueDequeue() {
		if (front == rear) {
			System.out.println("\nQueue is empty");
			return;
		}
		else {
			for (int i = 0; i < rear - 1; i++) {
				queue[i] = queue[i + 1];
			}
			
			if (rear < capacity)
				queue[rear] = 0;
			
			rear--;
		}
		return;
	}
	
	static void queueDisplay() {
		int i;
		if (front == rear) {
			System.out.println("Queue is Empty");
			return;
		}
		for (i = front; i < rear; i++) {
			System.out.print(queue[i] + " ");
		}
		System.out.println();
		return;
	}
	
	static void queueFront() {
		if (front == rear) {
			System.out.println("Queue is Empty");
			return;
		}
		System.out.println("\nFront Element of the queue: " + queue[front]);
		return;
	}
	
	
}
