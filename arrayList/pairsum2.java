public class pairsum2 {

    public static boolean pairsum2(int list[], int target) {
        int bp = -1;
        int n = list.length;
        for (int i = 0; i < list.length; i++) {
            if (list[i] > list[i + 1]) {
                bp = i;
                break;
            }
        }

        int lp = bp + 1;
        int rp = bp;

        while (lp != rp) {
            // case 1
            if (list[lp] + list[rp] == target) {
                return true;
            }

            // case 2
            if (list[lp] + list[rp] < target) {
                lp = (lp + 1) % n;
            } else {
                // case 3
                rp = (n + rp - 1) % n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int list[] = { 11, 15, 6, 8, 9, 10 };
        int target = 16;
        System.out.println(pairsum2(list, target));

    }
}
