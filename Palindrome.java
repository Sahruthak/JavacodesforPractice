import java.util.*;
public class Palindrome
{
	public static void main(String[] args) {
	    int r,rev=0,i,n,num;
	    Scanner sc=new Scanner(System.in);
	    n=sc.nextInt();
	    num=n;
	    while(n>0) 
	    {
	        r=n%10;
	        rev=rev*10+r;
	        n=n/10;
	    }
	    if(num==rev)
	    System.out.println("Palindrome");
	    else
	    System.out.println("Not Palindrome");
	}
}