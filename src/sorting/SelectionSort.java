package sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int arr[] = {15, 46, 13, 6, 22, 34, 23, 1, 27};
        SelectionSort selectionSort = new SelectionSort();
        System.out.println("Before Sorting");
        selectionSort.display(arr);
        selectionSort.sort(arr);
        System.out.println();
        System.out.println("After Sorting");
        selectionSort.display(arr);

    }

    public int[] sort(int arr[]) {
        int minIndex = 0;
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr;
    }

    public void display(int arr[]) {
        for (Integer item : arr) {
            System.out.print(item + "\t");
        }
    }

}
