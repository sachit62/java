import java.util.*;

public class queueJcf {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        q.offer(10);
        q.offer(20);
        q.offer(30);

        System.out.println(q.peek());   // 10
        System.out.println(q.poll());   // 10
        System.out.println(q.remove()); // 20
        System.out.println(q.isEmpty()); // false
    }
}
