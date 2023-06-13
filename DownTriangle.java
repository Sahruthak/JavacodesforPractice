import java.util.*;
public class DownTriangle
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
        for(int i=0; i<n; i++) {
           for(int j=n;j>i;j--) {
                   System.out.print("*");
               } 
           System.out.println();
       }
   }
}

