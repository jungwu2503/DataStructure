
public class Stack {
	char stackName;
	int top;
	int[] s = new int[100];

	Stack(char name) {
		stackName = name;
		top = -1;
		for (int i = 0; i < 100; i++) {
			s[i] = 0;
		}
	}
	
	void push(int x) {
		top++;
		s[top] = x;
	}
	
	int pop() {
		int x = s[top];
		s[top] = 0;
		top--;
		return x;
	}
	
	void display() {
		System.out.print(stackName+": ");
		int x = 0;
		
		for (int i = 0; ; i++) {
			x = s[i];
			if (x == 0) break;
			System.out.print(x + " ");
		}
		System.out.println();
	}
	
	char getName() {
		return stackName;
	}
	
	int getAt(int i) {
		return s[i];
	}
	
}
