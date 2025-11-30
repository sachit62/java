public class dll_allOcc {
    static Node deleteAllOccurOfX(Node head, int x) {

        Node temp = head;

        while (temp != null) {

            if (temp.data == x) {

                // case 1: deleting head
                if (temp == head) {
                    head = head.next;
                    if (head != null)
                        head.prev = null;
                } else {
                    Node prevNode = temp.prev;
                    Node nextNode = temp.next;

                    prevNode.next = nextNode;

                    if (nextNode != null)
                        nextNode.prev = prevNode;
                }
            }

            temp = temp.next; // move forward always
        }

        return head;
    }
}
