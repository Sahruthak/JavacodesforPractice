import java.util.*;

class Prog15 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = n - 1 - i; j >= 0; j--) {
                System.out.print(i + 1);
            }
            System.out.println();
        }

        sc.close();
    }
}
