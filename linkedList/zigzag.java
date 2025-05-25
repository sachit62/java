public class zigzag {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class LinkedList {
        Node head;

        public void addLast(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        public void print() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        // Zigzag rearrangement
        public void zigzag() {
            if (head == null || head.next == null) return;

            // Find mid
            Node slow = head;
            Node fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            Node mid = slow;

            // Reverse 2nd half
            Node prev = null;
            Node curr = mid.next;
            mid.next = null;
            Node next;
            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            // Merge alternately
            Node left = head;
            Node right = prev;
            Node nextL, nextR;

            while (left != null && right != null) {
                nextL = left.next;
                nextR = right.next;

                left.next = right;
                right.next = nextL;

                left = nextL;
                right = nextR;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);

        System.out.println("Before zigzag:");
        ll.print();

        ll.zigzag();

        System.out.println("After zigzag:");
        ll.print();
    }
}
