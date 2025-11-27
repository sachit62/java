
public class lengthOfLoop {
    public int lengthOfLoop(Node head) {
        if (head == null) return 0;

        Node slow = head, fast = head;

        // Detect loop
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Count loop length
                int len = 1;
                fast = fast.next;

                while (fast != slow) {
                    fast = fast.next;
                    len++;
                }
                return len;
            }
        }

        return 0;  // No loop
    }
}


