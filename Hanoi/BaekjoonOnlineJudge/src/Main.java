import java.util.*;
import java.io.*;
import java.math.BigInteger;

public class Main {
	
	static void hanoi(int n, int start, int mid, int end) {
		if (n == 1) {
			System.out.println(start+ " " + end);
			return;
		}
		
		hanoi(n - 1, start, end, mid);
		
		System.out.println(start+ " " + end);
		
		hanoi(n - 1, mid, start, end);
		
		return;
	}
	
	public static void main (String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		BigInteger bi = new BigInteger("2");
		BigInteger c = bi.pow(n).subtract(BigInteger.ONE);
		System.out.println(c);
		
		if (n <= 20)
			hanoi(n, 1, 2, 3);
		
		br.close();
	}	
	
}

