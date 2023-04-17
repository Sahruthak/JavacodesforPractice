import java.util.*;
public class Lefttriangle
{
	public static void main(String[] args) {
	    int i,j,n;
	    Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	    for(i=0;i<n;i++)
	    {
	    for(j=0;j<n;j++)
	    {
	        if(j<n-i-1)    
	        System.out.print(" ");
	        else
	        System.out.print("*");
	    }
	    System.out.println();
    	}
}
}