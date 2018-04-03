package sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int arr[] = {14, 46, 13, 6, 22, 34, 23, 1,27};
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println("Before Sorting");
        bubbleSort.display(arr);
        bubbleSort.sort(arr);
        System.out.println();
        System.out.println("After Sorting");
        bubbleSort.display(arr);
    }

    public int[] sort(int arr[]) {
        boolean isSorted = false;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = false;
                }
            }
            if (isSorted)
                return arr;
        }
        return arr;
    }

    public void display(int arr[]) {
        for (Integer item : arr) {
            System.out.print(item + "\t");
        }
    }
}
