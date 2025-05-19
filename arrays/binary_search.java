// binary search implementation

public class binary_search {
    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;

            // compare
            if (numbers[mid] == key) { // found
                return mid;
            }
            if (numbers[mid] < key) { // right
                start = mid + 1;
            } else {
                end = mid - 1; // left
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 3, 5, 7, 8, 9, 14 };
        int key = 8;

        System.out.println("index: " + binarySearch(numbers, key));
    }
}
