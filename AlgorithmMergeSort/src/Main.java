
public class Main {

	static int NUMBER = 8;
	static int[] SORTED = new int[8];
	static int[] a = {7, 6, 5, 8, 3, 5, 9, 1};
	
	public static void main(String[] args) {
		
		mergeSort(0, NUMBER - 1);
		
		for (int i = 0; i < NUMBER; i++) {
			System.out.print(a[i] + " ");
		}
		
	}

	public static void merge(int m, int middle, int n) {
		
		int i = m;
		int j = middle + 1;
		int k = m;
		
		while (i <= middle && j <= n) {
			if (a[i] <= a[j]) {
				SORTED[k] = a[i];
				i++;
			} else {
				SORTED[k] = a[j];
				j++;
			}
			k++;
		}
		
		if (i > middle) {
			for (int t = j; t <= n; t++) {
				SORTED[k] = a[t];
				k++;
			}
		} else {
			for (int t = i; t <= middle; t++) {
				SORTED[k] = a[t];
				k++;
			}
		}
		
		for (int t = m; t <= n; t++) {
			a[t] = SORTED[t];
		}
		
	}
	
	public static void mergeSort(int m, int n) {
		if (m < n) {
			int middle = (m + n) / 2;
			mergeSort(m, middle);
			mergeSort(middle + 1, n);
			merge(m, middle, n);
		}
	}
	
}
