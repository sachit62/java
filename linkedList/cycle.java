public class cycle {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    // Detect cycle using Floyd's algorithm
    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // Remove cycle from linked list
    public static void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        if (!cycle)
            return;

        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        // `fast` is now at the start of the cycle
        prev.next = null; // remove cycle
    }

    // Print the list
    public static void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create nodes
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Creating a cycle: 5 -> 3
        head.next.next.next.next.next = head.next.next; // 5 -> 3

        // Check if cycle exists
        System.out.println("Cycle present? " + isCycle());

        // Remove the cycle
        removeCycle();

        // Check again
        System.out.println("Cycle present after removal? " + isCycle());

        // Print list after cycle removal
        printList(); // Should print normally now
    }
}
