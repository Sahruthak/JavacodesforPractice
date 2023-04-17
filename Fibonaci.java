import java.util.*;
public class Fibonaci
{
	public static void main(String[] args) {
	    int a=0,b=1,c=1,d,i,n;
	    Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	    if(n>=1)
	    {
	      System.out.print(a+" ");  
	    }
	    if(n>=2)
	    {
	      System.out.print(b+" ");  
	    }
	    if(n>=3)
	    {
	      System.out.print(c+" ");  
	    }
	    if(n>=4)
	    {
	    for(i=4;i<=n;i++)  
	    {
	        d=b+c;
	        System.out.print(d+" ");
	        b=c;
	        c=d;
	    }
	    }
	}
}