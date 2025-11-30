public class dll_removeDup {
    Node removeDuplicates(Node head) {
        if (head == null)
            return head;

        Node temp = head;

        while (temp != null) {
            Node nextNode = temp.next;

            // Remove all duplicates ahead
            while (nextNode != null && nextNode.data == temp.data) {
                nextNode = nextNode.next;
            }

            // Link temp to the next distinct node
            temp.next = nextNode;
            if (nextNode != null)
                nextNode.prev = temp;

            // Move forward
            temp = temp.next;
        }

        return head;
    }
}
