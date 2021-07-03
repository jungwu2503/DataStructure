
public class Main {

	public static void printStack(char name, Stack x, Stack y, Stack z, Console screen) {
		if (x.getName() == name)
			screen.drawDisc(name, x);
		if (y.getName() == name)
			screen.drawDisc(name, y);
		if (z.getName() == name)
			screen.drawDisc(name, z);		
	}
	
	public static void moveHanoi(int n, Stack from, Stack temp, Stack to, Console screen) {
		if (n == 1) {
			int x = from.pop();
			to.push(x);
			screen.resetScreen();
			printStack('A', from, temp, to, screen);
			printStack('B', from, temp, to, screen);
			printStack('C', from, temp, to, screen);
			screen.show();
			return;
		}
		moveHanoi(n-1, from, to, temp, screen);
		moveHanoi(1, from, temp, to, screen);
		moveHanoi(n-1, temp, from, to, screen);
	}
	
	public static void main(String[] args) {
		
		Stack a = new Stack('A');
		Stack b = new Stack('B');
		Stack c = new Stack('C');
		Console screen = new Console(5);
		
		a.push(5);
		a.push(4);
		a.push(3);
		a.push(2);
		a.push(1);
		screen.drawDisc('A', a);
		screen.show();
		
		moveHanoi(5, a, b, c, screen);
	}

}
