// implementation

import java.util.*;

public class LinkedList {

    // node creation
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head;
    public Node tail;
    public int size; // size=0

    // add first function
    public void addFirst(int data) {
        // step 1 = create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 = newNode next = head
        newNode.next = head;

        // step 3 = head = newNode
        head = newNode;
    }

    // add last function
    public void addLast(int data) {
        // step 1 = create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 = tail next = newnode
        tail.next = newNode;

        // step 3 = tail = newNode
        tail = newNode;
    }

    // print function
    public void print() {
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // add in middle function
    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }

        // i = idx-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // remove first function
    public int removeFirst() {
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // remove last function
    public int removeLast() {
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        // prev : i = size-2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data; // tail data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    // iterative search
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) { // key found
                return i;
            }
            temp = temp.next;
            i++;
        }

        // key not found
        return -1;
    }

    // recursive search
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    // reverse a ll
    public void reverse() { // O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    // remove nth node from end
    public void deleteNthfromEnd(int n) {
        // calc size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (n == sz) {
            head = head.next; // removeFirst
            return;
        }

        // sz-n\
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;
    }

    // find mid of ll
    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // slow is my midNode
    }

    // check ll is palindrome or not
    public boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // step1 - find mid
        Node midNode = findMid(head);

        // step2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // right half head
        Node left = head;

        // step3 - check left and right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        System.out.println("Adding elements using addFirst and addLast:");
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1); // List: 1 -> 2 -> 3
        ll.addLast(4);
        ll.addLast(5); // List: 1 -> 2 -> 3 -> 4 -> 5
        ll.print();

        System.out.println("\nAdding element at index 2:");
        ll.add(2, 99); // List: 1 -> 2 -> 99 -> 3 -> 4 -> 5
        ll.print();

        System.out.println("\nRemoving first and last elements:");
        System.out.println("Removed First: " + ll.removeFirst()); // 1
        System.out.println("Removed Last: " + ll.removeLast()); // 5
        ll.print(); // List: 2 -> 99 -> 3 -> 4

        System.out.println("\nSearching for elements:");
        System.out.println("Iterative Search for 99: " + ll.itrSearch(99)); // should return index
        System.out.println("Recursive Search for 4: " + ll.recSearch(4)); // should return index
        System.out.println("Iterative Search for 100: " + ll.itrSearch(100)); // should return -1

        System.out.println("\nReversing the list:");
        ll.reverse();
        ll.print(); // List reversed

        System.out.println("\nDeleting 2nd node from the end:");
        ll.deleteNthfromEnd(2);
        ll.print();

        System.out.println("\nChecking if list is a palindrome:");
        LinkedList palList = new LinkedList();
        palList.addLast(1);
        palList.addLast(2);
        palList.addLast(2);
        palList.addLast(1);
        palList.print();
        System.out.println("Is Palindrome: " + palList.isPalindrome());
    }
}
