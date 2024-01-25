import java.util.*;

public class Practice{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fib(n);
        prime(n);
        palin(n);
        System.out.println("Fact: " + fact(n));
        amstrong(n);
        System.out.println(Math.random());
    }

    public static void fib(int n) {
        if (n >= 1) {
            System.out.print(0 + " ");
        }
        if (n >= 2) {
            System.out.print(1 + " ");
        }
        if (n >= 3) {
            int a = 1, b = 1, c;
            for (int i = 3; i <= n; i++) {
                c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        }
        System.out.println();
    }

    public static void prime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                    System.out.println("Not Prime");
                    return;
                }
            }
        }
        System.out.println("Prime");
    }

    public static void palin(int n) {
        int num = n, rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        if (num == rev) {
            System.out.println("Pal");
        } else {
            System.out.println("Not Pal");
        }
    }
    
    public static int fact(int n) {
        if(n==0) {
            return 1;
        }
        return n*fact(n-1);
    }
    
    public static void amstrong(int n) {
        int num = n,count=0;
        double sum= 0;
        
        while (n > 0) {
            n = n / 10;
            count++;
        }
        n=num;
        
        while (n > 0) {
            int d=n % 10;
            sum = Math.pow(d,count)+sum;
            n = n / 10;
        }
        if (num == sum) {
            System.out.println("Amstrong");
        } else {
            System.out.println("Not Amstrong");
        }
    }

}




