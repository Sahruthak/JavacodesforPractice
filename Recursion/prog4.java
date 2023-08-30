import java.util.*;

class Prog4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recur(n, 1);
        sc.close();
    }

    public static void recur(int n, int fact) {
        if (n == 1) {
            System.out.print(fact);
            return;
        }
        recur(n - 1, fact * n);
    }
}
