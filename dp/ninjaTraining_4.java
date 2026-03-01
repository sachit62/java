import java.util.*;

public class ninjaTraining_4 {

    // Function to find maximum points
    public static int ninjaTraining(int n, int[][] points) {

        int[] prev = new int[4];

        // Base Case (Day 0)
        prev[0] = Math.max(points[0][1], points[0][2]);
        prev[1] = Math.max(points[0][0], points[0][2]);
        prev[2] = Math.max(points[0][0], points[0][1]);
        prev[3] = Math.max(points[0][0],
                Math.max(points[0][1], points[0][2]));

        for (int day = 1; day < n; day++) {

            int[] temp = new int[4];

            for (int last = 0; last < 4; last++) {

                for (int task = 0; task < 3; task++) {

                    if (task != last) {
                        temp[last] = Math.max(
                                temp[last],
                                points[day][task] + prev[task]
                        );
                    }
                }
            }

            prev = temp;
        }

        return prev[3];
    }

    public static void main(String[] args) {

        int[][] points = {
                {10, 40, 70},
                {20, 50, 80},
                {30, 60, 90}
        };

        int n = points.length;

        System.out.println(ninjaTraining(n, points));
    }
}