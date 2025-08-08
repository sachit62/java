import java.util.ArrayList;

public class insertInHeap {
    static class Heap {
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            arr.add(data);
            int x = arr.size() - 1; // child index
            int par = (x - 1) / 2;

            while (x > 0 && arr.get(x) < arr.get(par)) { // O(logn)
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x - 1) / 2;
            }
        }

        public int peek() {
            return arr.get(0);
        }

        private void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int minIdx = i;

            if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }
            if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }
            if (minIdx != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);
                heapify(minIdx);
            }
        }

        public int remove() {
            int data = arr.get(0);
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size() - 1));
            arr.set(arr.size() - 1, temp);
            arr.remove(arr.size() - 1);
            heapify(0);
            return data;
        }

        public boolean isEmpty() {
            return arr.size() == 0;
        }
    }

    public static void main(String[] args) {
        Heap heap = new Heap();

        System.out.println("Inserting elements into Min Heap:");
        heap.add(5);
        heap.add(3);
        heap.add(8);
        heap.add(1);

        System.out.println("Current Min Heap array: " + heap.arr);

        System.out.println("\nPeek (minimum element): " + heap.peek());

        System.out.println("\nRemoving elements one by one:");
        while (!heap.isEmpty()) {
            System.out.println("Removed: " + heap.remove() + " | Heap now: " + heap.arr);
        }

        System.out.println("\nIs heap empty? " + heap.isEmpty());
    }
}
