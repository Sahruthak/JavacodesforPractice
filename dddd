import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner c=new Scanner(System.in);
	    int a=c.nextInt();
	    int b=c.nextInt();
	    int n=a^b;
	    int count=0;
	    while(n>0)
	    {
	        int m=n-1;
	        if((n&m)!=0){
	            n=n&m;
	            count++;
	        }
	    }
	    System.out.println("count :"+count);
	}
}
