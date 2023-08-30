import java.util.*;

class Prog19 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(j);
            }

            for (int j = 1; j < i + 1; j++) {
                System.out.print("*");
            }

            for (int j = 1; j < i + 1; j++) {
                System.out.print("*");
            }

            for (int j = n - i; j > 0; j--) {
                System.out.print(j);

            }

            System.out.println();
        }

        sc.close();
    }
}