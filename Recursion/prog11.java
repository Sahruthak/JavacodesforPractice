import java.util.*;

class Prog11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char ch = 'A';

        for (int i = 0; i < n; i++) {
            ch += (n - i - 1);
            for (int j = 0; j < i + 1; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            ch = 'A';
            System.out.println();
        }

        sc.close();
    }
}