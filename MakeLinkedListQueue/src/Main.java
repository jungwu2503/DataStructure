
public class Main {

	public static void main(String[] args) {
		
		LinkedListQueue queue = new LinkedListQueue();
		
		queue.enqueue(6);
		queue.enqueue(3);
		queue.print_frontRear();
		queue.enqueue(12);
		queue.enqueue(24);
		queue.dequeue();
		queue.dequeue();
		queue.enqueue(9);
		
		queue.print_frontRear();
	}

}
