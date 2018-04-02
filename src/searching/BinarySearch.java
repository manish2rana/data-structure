package searching;

public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {11, 23, 34, 45, 77, 85, 91};
        BinarySearch binarySearch = new BinarySearch();
        int x = 45;
        int result = binarySearch.search(arr, arr.length - 1, x);
        //int result = binarySearch.search(arr,  arr.length - 1, x);

        if (result == -1) {
            System.out.print(x + " not found..!!");
        } else {
            System.out.print(x + " found at index " + result);
        }
    }

    public int search(int arr[], int first, int last, int x) {
        if (last >= first) {
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

    public int search(int arr[], int last, int x) {
        int start = 0;
        while (start <= last) {
            int mid = (start + last) / 2;
            if (x == arr[mid]) {
                return mid;
            } else if (x > arr[mid]) {
                start = mid + 1;
            }else {
                last=mid-1;
            }
        }
        return -1;
    }
}
