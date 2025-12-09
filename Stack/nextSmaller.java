import java.util.*;
import java.io.*;

public class nextSmaller {
    static ArrayList<Integer> nextSmallerElement(ArrayList<Integer> arr, int n) {
        // Write your code here.
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> a = new ArrayList<>();
        int[] ar = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            if (st.isEmpty()) {
                st.push(arr.get(i));
                ar[i] = -1;
                ;
            } else {
                while (!st.isEmpty() && st.peek() >= arr.get(i)) {
                    st.pop();
                }
                if (st.isEmpty()) {
                    ar[i] = -1;
                } else {
                    ar[i] = st.peek();
                }
                st.push(arr.get(i));
            }
        }
        for (int i = 0; i < n; i++) {
            a.add(ar[i]);
        }
        return a;
    }
}
