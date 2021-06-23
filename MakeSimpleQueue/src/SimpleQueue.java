
public class SimpleQueue {

	public static void main(String[] args) {
		
		MyQueue q = new MyQueue(4);
		
		q.queueDisplay();
		
		q.queueEnqueue(10);
		q.queueEnqueue(30);
		q.queueEnqueue(50);
		q.queueEnqueue(70);
		
		q.queueDisplay();
		
		q.queueFront();
		
		q.queueEnqueue(90);
		
		q.queueDisplay();
		
		q.queueDequeue();
		q.queueDequeue();
		
		q.queueDisplay();
		
		q.queueFront();
		
	}

}
