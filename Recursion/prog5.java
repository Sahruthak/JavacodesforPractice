import java.util.*;

class Prog5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        recur(n, "Sahrutha");
        sc.close();
    }

    public static void recur(int n, String name) {
        if (n < 1) {
            return;
        }
        System.out.print(name + " ");
        recur(n - 1, name);
    }
}
