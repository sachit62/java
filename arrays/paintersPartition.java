import java.util.*;

class paintersPartition {

    // Function to count how many students are needed for given max pages
    public static int countStudents(ArrayList<Integer> arr, int pages) {
        int n = arr.size();
        int students = 1;
        long pagesStudent = 0;

        for (int i = 0; i < n; i++) {
            if (pagesStudent + arr.get(i) <= pages) {
                pagesStudent += arr.get(i);
            } else {
                students++;
                pagesStudent = arr.get(i);
            }
        }
        return students;
    }

    // Binary Search to find minimum pages
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        if (m > n) return -1;  // impossible if students > books

        int low = Collections.max(arr);
        int high = arr.stream().mapToInt(Integer::intValue).sum();
        int ans = -1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int students = countStudents(arr, mid);

            if (students > m) {
                low = mid + 1;
            } else {
                ans = mid;
                high = mid - 1;
            }
        }
        return ans;
    }

    // Wrapper function for minTime
    public int minTime(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int val : arr) list.add(val);
        return findPages(list, list.size(), k);
    }
}
