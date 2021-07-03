// Refactoring

public class Main {

/*	public static void printStack(char name, Stack x, Stack y, Stack z, Console screen) {
		if (x.getName() == name)
			screen.drawDisc(name, x);
		if (y.getName() == name)
			screen.drawDisc(name, y);
		if (z.getName() == name)
			screen.drawDisc(name, z);		
	}
	
	*/
	
	public static void main(String[] args) {
		
		Temple templeHanoi = new Temple(5);
		
		templeHanoi.run();
		
/*		Stack a = new Stack('A');
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
		
		moveHanoi(5, a, b, c, screen); */
		
	}

}
