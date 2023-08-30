import java.util.*;

class Prog2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recur(n);
        sc.close();
    }

    public static void recur(int n) {
        if (n < 1) {
            return;
        }
        System.out.print(n + " ");
        recur(n - 1);
    }
}
