
public class Temple {

	Stack towerA;
	Stack towerB;
	Stack towerC;
	Console screen;
	
	public Temple(int nDisc) {
		towerA = new Stack('a');
		towerB = new Stack('b');
		towerC = new Stack('c');
		screen = new Console(nDisc);
	}
	
	public void run() {
		towerA.push(5);
		towerA.push(4);
		towerA.push(3);
		towerA.push(2);
		towerA.push(1);
		
		screen.drawDisc('A', towerA);
		screen.show();
		
		moveHanoi(5, towerA, towerB, towerC);
	}
	
	private void moveHanoi(int n, Stack from, Stack temp, Stack to) {
		if (n == 1) {
			int x = from.pop();
			to.push(x);
			screen.resetScreen();
			screen.drawDisc('A', towerA);
			screen.drawDisc('B', towerB);
			screen.drawDisc('C', towerC);
//			printStack('A', from, temp, to, screen);
//			printStack('B', from, temp, to, screen);
//			printStack('C', from, temp, to, screen);
			screen.show();
			return;
		}
		moveHanoi(n-1, from, to, temp);
		moveHanoi(1, from, temp, to);
		moveHanoi(n-1, temp, from, to);
	}
	
}
