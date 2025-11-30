import java.util.* ;
import java.io.*; 

public class add1 {
	public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

	public static Node addOne(Node head) {

		head = reverse(head);

		int carry = 1;
		Node temp = head;

		while (temp != null) {
			int sum = temp.data + carry;  // correct sum
			temp.data = sum % 10;         // digit
			carry = sum / 10;             // correct carry

			if (carry == 0)
				break;

			if (temp.next == null)
				break;

			temp = temp.next;
		}

		if (carry > 0) {
			temp.next = new Node(carry);
		}

		head = reverse(head);
		return head;
	}
}
