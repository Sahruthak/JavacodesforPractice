import java.util.*;

class Prog1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recur(1, n);
        sc.close();
    }

    public static void recur(int i, int n) {
        if (i > n) {
            return;
        }
        System.out.print(i + " ");
        recur(i + 1, n);
    }
}
