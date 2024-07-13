import java.util.*;
public class Factorial
{
	public static void main(String[] args) {
	    int i,n,fact=1;
	    Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	    if(n==0)
	    System.out.println(1);
	    else if(n>0)
	    {
	    for(i=1;i<=n;i++){
	     fact=fact*i;
    	}
    	System.out.println(fact);
	    }
	    else
	    System.out.println("Not Factorial");
	}
}


