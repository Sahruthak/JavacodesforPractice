import java.util.*;
public class Recursion {
    public static void printnum(int n) {
        if(n==0){ return; }
        System.out.print(n+" ");
        printnum(n-1);
    }
    public static void printnums(int i,int m) {
        if(i==m+1){ return; }
        System.out.print(i+" ");
        printnums(i+1,m);
    }
    public static void sum(int sum,int k)
    {
        if(k==0){ 
            System.out.println(sum);
            return; }
        sum+=k;
        sum(sum,k-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printnum(n);
        System.out.println();
        int m=sc.nextInt();
        printnums(1,m);
        int k=sc.nextInt();
        sum(0,k);
    
    }    
}
