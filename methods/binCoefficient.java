// nCr vala formula ka q 

public class binCoefficient {
    public static int factorial(int number) {
        int f = 1;
        for (int i = 1; i <= number; i++) {
            f = f * i;
        }
        return f;
    }

    public static int binoCoeff(int n, int r) {
        int ans;
        ans = factorial(n) / (factorial(r) * factorial(n - r));
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("nCr is: " + binoCoeff(5, 2));
    }
}
