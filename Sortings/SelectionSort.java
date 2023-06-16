import java.util.*;
public class SelectionSort {
    public static void main(String[] args) {
	    int n,i,j,temp;
	    Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for(i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n-1;i++) {
            int smallest=i;
            for(j=i+1;j<n;j++) {
                if(a[j] < a[smallest]) {
                    smallest=j;
                }
            }
            temp=a[smallest];
            a[smallest]=a[i];
            a[i]=temp;
        }
        for(i=0;i<n;i++) {
            System.out.print(a[i]+" ");
        }
    }
}

