import java.util.*;
public class Prime
{
	public static void main(String[] args) {
	    int d=0,i,n;
	    Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	    for(i=1;i<n;i++)  
	    {
	        if(n%i==0)
	        d++;
	    }
	    if(d>2)
	    System.out.print("Not prime");
	    else
	    System.out.print("Prime");
	}
}