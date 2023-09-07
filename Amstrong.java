import java.util.*;
public class Amstrong
{
	public static void main(String[] args) {
	    int n,r,rev=0,num;
	    Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	    num=n;
	    while(n>0) 
	    {
	        r=n%10;
	        rev=rev+r*r*r;
	        n=n/10;
	    }
	    if(num==rev)
	    System.out.println("Armstrong");
	    else
	    System.out.println("Not Armstrong");
	}
}



