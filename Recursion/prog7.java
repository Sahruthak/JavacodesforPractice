import java.util.*;

class Prog7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
        sc.close();

        System.out.println();

        int i = 1;
        char c = 'A';

        while (i <= n * n) {
            System.out.print(c + " ");
            c++;
            if (i % n == 0) {
                System.out.println();
            }
            i++;
        }
    }
}
