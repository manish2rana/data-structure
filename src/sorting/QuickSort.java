package sorting;

public class QuickSort {

    public static void main(String[] args) {
        int arr[] = {15, 46, 13, 6, 22, 34, 23, 1, 27};
        QuickSort quickSort = new QuickSort();
        System.out.println("Before Sorting");
        quickSort.display(arr);
        quickSort.sort(arr,0,arr.length-1);
        System.out.println();
        System.out.println("After Sorting");
        quickSort.display(arr);
    }

    public void sort(int[] arr, int low, int high) {
        if (arr == null || arr.length == 0) {
            return;
        }
        if (low >= high)
            return;

        int mid = low + (high - low) / 2;
        int pivot = arr[mid];

        int i = low, j = high;
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        if (low < j)
            sort(arr, low, j);
        if (high > i)
            sort(arr, i, high);
    }

    public void display(int arr[]) {
        for (Integer item : arr) {
            System.out.print(item + "\t");
        }
    }
}
