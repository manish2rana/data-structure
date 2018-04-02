package searching;

/**
 * Works on sorted Arrays.
 * The basic idea is to check fewer elements (than linear search) by jumping
 * ahead by fixed steps or skipping some elements in place of searching all elements.
 */
public class JumpSearch {

    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610};
        int x = 34;
        JumpSearch jumpSearch = new JumpSearch();
        int result = jumpSearch.search(arr, x);
        if (result == -1) {
            System.out.print(x + " not found..!!");
        } else {
            System.out.print(x + " found at index " + result);
        }
    }


    public int search(int arr[], int x) {
        int n = arr.length;
        int step = (int) Math.floor(Math.sqrt(n));
        int prev;

        for (int i = 0; i < arr.length; i = i + step) {
            if (arr[i] > x) {
                for (int j = i; j > i - step; j--) {
                    if (arr[j] == x) {
                        return j;
                    }
                }
            }
        }
        return -1;
    }

}
