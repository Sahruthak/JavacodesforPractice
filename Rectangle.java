import java.util.*;
public class Rectangle
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int i,j;
	    int n=sc.nextInt();
	    int m=sc.nextInt();
	    int start=0,end=n-1,top=0,bottom=m-1; 
        for(i=0; i<n; i++) {
           for(j=0; j<m; j++) {
               if(i == start || i == end || j == top || j == bottom) {
                   System.out.print("*");
               } else {
                   System.out.print(" ");
               }
           }
           System.out.println();
       }
   }
}

