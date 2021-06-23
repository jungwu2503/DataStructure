
public class Maze {

	public int m, n;
	public int[][] maze;
	public int[][] mark;
	public int[][] stack;
	public static int[][] move = { {0,1}, {0,-1}, {1,0}, {-1,0} };
	
	public Maze(int m, int n, int[][] maze) {
		this.m = m;
		this.n = n;
		this.maze = maze;
		mark = new int [m+2][n+2];
		
		for (int i = 0; i < m + 2; i++) {
			for (int j = 0; j < n + 2; j++) {
				mark[i][j] = 0;
			}
		}
		
		stack = new int[(m+2) * (n+2)][3];		
	
	}
	
	void path() {
		mark[1][1] = 1;
		stack[0][0] = 1;
		stack[0][1] = 1;
		stack[0][2] = 0;
		
		int top = 0, i, j, mov, g, h;
		
		while (top >= 0) {
			i = stack[top][0];
			j = stack[top][1];
			mov = stack[top][2];
			top--;
			
			while (mov < 4) {
				g = i + move[mov][0];
				h = j + move[mov][1];
				if (g == m && h == n) {
					for (int p = 0; p <= top; p++) {
						System.out.print("(" + stack[p][0] + ",");
						System.out.println(stack[p][1]+ ")");
					}
					System.out.println("(" + i + "," + j + ")");
					System.out.println("(" + m + "," + n + ")");
					return;
				}
				
				if (maze[g][h] == 0 && mark[g][h] == 0) {
					mark[g][h] = 1;
					top++;
					stack[top][0] = i;
					stack[top][1] = j;
					stack[top][2] = mov;
					mov = -1;
					i = g;
					j = h;
				}
				mov++;	
			}
		}
		System.out.println("no path...");
	}
	
	 
}
