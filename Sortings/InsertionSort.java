import java.util.*;
public class InsertionSort {
    public static void main(String[] args) {
	    int n,i,j,current;
	    Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }       
       for(i=1; i<n; i++) {
           current = a[i];
           j = i - 1;
               while(j >= 0 && a[j] > current) {
                   a[j+1] = a[j];
                   j--;
               }
           a[j+1] = current;
       }
       for(i=0;i<n;i++) {
            System.out.print(a[i]+" ");
        }
   }
}
