import java.util.*;

class Prog3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = recur(n, 0);
        System.out.println(ans);
        sc.close();
    }

    public static int recur(int n, int sum) {
        if (n < 1) {
            return sum;
        }
        return recur(n - 1, sum + n);
    }
}
