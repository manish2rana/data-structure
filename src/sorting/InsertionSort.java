package sorting;

public class InsertionSort {

    public static void main(String[] args) {
        int arr[] = {15, 46, 13, 6, 22, 34, 23, 1, 27};
        InsertionSort insertionSort = new InsertionSort();
        System.out.println("Before Sorting");
        insertionSort.display(arr);
        insertionSort.sort(arr);
        System.out.println();
        System.out.println("After Sorting");
        insertionSort.display(arr);
    }

    public int[] sort(int arr[]) {
        int element;
        int j;
        for (int i = 0; i < arr.length; i++) {
            element = arr[i];
            j = i;
            while (j > 0 && arr[j - 1] > element) {
                arr[j] = arr[j - 1];
                j = j - 1;
            }
            arr[j] = element;
        }
        return arr;
    }

    public void display(int arr[]) {
        for (Integer item : arr) {
            System.out.print(item + "\t");
        }
    }

}
