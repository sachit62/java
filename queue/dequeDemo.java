import java.util.*;

public class dequeDemo {
    public static void main(String[] args) {

        // Create a deque of integers
        Deque<Integer> dq = new ArrayDeque<>();

        /* ---------------------------------------------
         * ADD OPERATIONS
         * --------------------------------------------- */

        // Add element at the front
        dq.addFirst(10);   // dq = [10]

        // Add element at the back
        dq.addLast(20);    // dq = [10, 20]

        // Offer versions (do NOT throw exception)
        dq.offerFirst(5);  // dq = [5, 10, 20]
        dq.offerLast(25);  // dq = [5, 10, 20, 25]


        /* ---------------------------------------------
         * PEEK OPERATIONS   (just view, no removal)
         * --------------------------------------------- */

        int frontPeek = dq.peekFirst(); // returns 5
        int backPeek  = dq.peekLast();  // returns 25


        /* ---------------------------------------------
         * REMOVE OPERATIONS
         * --------------------------------------------- */

        // Remove from front
        int removedFront = dq.removeFirst(); // removes 5 → dq = [10, 20, 25]

        // Remove from back
        int removedBack  = dq.removeLast();  // removes 25 → dq = [10, 20]

        // Poll versions (return null if empty)
        dq.pollFirst();   // removes 10 → dq = [20]
        dq.pollLast();    // removes 20 → dq = []


        /* ---------------------------------------------
         * OTHER IMPORTANT FUNCTIONS
         * --------------------------------------------- */

        dq.addLast(100);
        dq.addLast(200);
        dq.addLast(300);   // dq = [100, 200, 300]

        // Check size
        int sz = dq.size(); // 3

        // Check if empty
        boolean empty = dq.isEmpty(); // false

        // Contains element?
        boolean has200 = dq.contains(200); // true

        // Clear deque
        dq.clear(); // dq = []
    }
}
