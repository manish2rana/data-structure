package searching;

public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {11, 23, 34, 45, 77, 85, 91};
        BinarySearch binarySearch = new BinarySearch();
        int x = 41;
        int result = binarySearch.search(arr, 0, arr.length - 1, x);

        if (result == -1) {
            System.out.print(x + " not found..!!");
        } else {
            System.out.print(x + " found at index " + result);
        }
    }

    public int search(int arr[], int first, int last, int x) {
        if (last >=first) {
            int mid = (first + last) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (x > arr[mid]) {
                return search(arr, mid + 1, last, x);
            } else if (x < arr[mid]) {
                return search(arr, first, mid - 1, x);
            }
        }
        return -1;
    }

    public int search(int arr[],){
        for ()
    }
}
