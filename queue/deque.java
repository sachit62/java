import java.util.*;

public class deque {
    public static void main(String[] args) {
        // deque is a interface
        Deque<Integer> dq = new LinkedList<>();
        dq.addFirst(1);
        dq.addFirst(2);
        dq.addLast(3);
        dq.addLast(4);
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
    }
}
