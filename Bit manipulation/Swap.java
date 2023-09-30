import java.util.*;
public class Swap
{
	public static void main(String[] args) {
	    Scanner c=new Scanner(System.in);
	    int a=c.nextInt();
	    int b=c.nextInt();
	    a=a^b;
	    b=b^a;
	    a=a^b;
		System.out.println("a : "+a);
		System.out.println("b : "+b);
	}
}

