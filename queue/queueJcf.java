import java.util.*;

public class queueJcf {
    public static void main(String[] args) {
        // Queue is interface we can implement
        // it with linkedlist and arrayDeque
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        // 1 2 3
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
