
public class BubbleSort implements SortingAlgorithm {
	
	public void sort(int[] a) {
		int temp = 0;
		for (int i = a.length-1; i >= 0; i--) {
			for (int j = 0; j < i;  j++) {
				if (a[j] > a[j + 1]) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		
	}
}
