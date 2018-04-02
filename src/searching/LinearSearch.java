package searching;

public class LinearSearch {

    public static void main(String[] args) {
        int arr[] = {12, 34, 56, 1, 55, 67, 32};
        LinearSearch linearSearch = new LinearSearch();
        int x = 1;
        int result = linearSearch.search(arr, x);

        if (result == -1) {
            System.out.print(x + " not found..!!");
        } else {
            System.out.print(x + " found at index " +result);
        }
    }

    public int search(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x)
                return i;
        }
        return -1;
    }
}
