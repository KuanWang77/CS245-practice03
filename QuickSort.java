
public class QuickSort implements SortingAlgorithm{
	
	public void sort(int[] a) {
        quicksort(a,0, a.length - 1);
    }

    private void quicksort(int[] a, int low, int high) {
        int i = low, j = high;
        int pivot = a[low + (high-low)/2];

        while (i <= j) {
            while (a[i] < pivot) {
                i++;
            }
            while (a[j] > pivot) {
                j--;
            }

            if (i <= j) {
            	int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        if (low < j)
            quicksort(a,low, j);
        if (i < high)
            quicksort(a,i, high);
    }

}
