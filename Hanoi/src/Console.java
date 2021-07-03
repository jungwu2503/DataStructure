
public class Console {

	char[][] s;
	int nDisc;
	
	Console(int n) {
		int i;
		nDisc = n;
		s = new char[nDisc+1][];
		
		for (i = 0; i < nDisc+1; i++) {
			s[i] = new char[3*(nDisc+3)];
		}
		
		resetScreen();
	}
	
	void resetScreen() {
		int i, j;
		
		for (i = 0; i < nDisc + 1; i++) {
			for (j = 0; j < 3 * (nDisc+3); j++) {
				s[i][j] = ' ';
				if (i == nDisc) {
					if (j % (nDisc+3) != 0)
						s[i][j] = '=';
				}
			}
		}
		s[nDisc][2] = 'A';
		s[nDisc][nDisc+5] = 'B';
		s[nDisc][2*nDisc+8] = 'C';
	}

	void drawDisc(char name, Stack tower) {
		int x;
		int i, j;
		int pos = name - 'A' + 1;
		int startPos = (pos - 1) * (nDisc+3)+2;
		
		i = 0;
		while ((x = tower.getAt(i)) != 0) {
			i++;
			for (j = startPos; j < startPos+x; j++) {
				s[nDisc-i][j] = '*';
			}
		}
	}
	
	void show() {
		int i, j;
		for (i = 0; i < nDisc+1; i++) {
			for (j = 0; j < 3 * (nDisc+3); j++) {
				System.out.print(s[i][j]);
			}
			System.out.println();
		}
	}
	
}
