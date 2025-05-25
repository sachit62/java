public class doubleLL {
    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Add at beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    // ✅ Add at end
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    // Print list
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Remove from beginning
    public int removeFirst() {
        if (head == null) {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    // ✅ Remove from end
    public int removeLast() {
        if (tail == null) {
            System.out.println("DLL is empty");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {
            int val = tail.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = tail.data;
        tail = tail.prev;
        tail.next = null;
        size--;
        return val;
    }

    // Reverse the list
    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    // ✅ Main method to test functionality
    public static void main(String[] args) {
        doubleLL dll = new doubleLL();

        // Test addFirst and addLast
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addLast(4);
        dll.addLast(5);

        System.out.println("Original list:");
        dll.print();  // Output: 1 <-> 2 <-> 3 <-> 4 <-> 5 <-> null

        // Test removeFirst and removeLast
        System.out.println("Removed first: " + dll.removeFirst()); // 1
        System.out.println("Removed last: " + dll.removeLast());   // 5

        System.out.println("After removals:");
        dll.print();  // Output: 2 <-> 3 <-> 4 <-> null

        // Test reverse
        dll.reverse();
        System.out.println("After reversing:");
        dll.print();  // Output: 4 <-> 3 <-> 2 <-> null
    }
}
