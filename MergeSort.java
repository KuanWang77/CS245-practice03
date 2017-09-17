
public class MergeSort implements SortingAlgorithm{
	
	public void sort(int[] a) {
		int temp[] = new int[a.length];
		mergesort(a,0,a.length-1,temp);
	}
	public void mergesort(int[] arr, int i, int j, int[] temp) {
        int mid = 0;

        if(i < j) {
            mid = (i + j) / 2;
            mergesort(arr, i, mid,temp);
            mergesort(arr, mid + 1, j,temp);
            merge(arr, i, mid, j,temp);
        }
    }

	public void merge(int[] arr, int i, int mid, int j, int[] temp) {
        //int temp[] = new int[arr.length];
        int l = i;
        int r = j;
        int m = mid + 1;
        int k = l;

        while(l <= mid && m <= r) {
            if(arr[l] <= arr[m]) {
                temp[k++] = arr[l++];
            }
            else {
                temp[k++] = arr[m++];
            }
        }

        while(l <= mid)
            temp[k++] = arr[l++];

        while(m <= r) {
            temp[k++] = arr[m++];
        }

        for(int i1 = i; i1 <= j; i1++) {
            arr[i1] = temp[i1];
        }
    }
}
