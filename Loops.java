import java.util.*;
public class Loops
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int i;
	    int n=sc.nextInt();
	    for(i=1;i<n;i++) {
		System.out.print(i+" ");
	    }
	    System.out.println();
	    i=1;
		while(i<n)
		{
		 System.out.print(i+" ");
		 i++;
		}
		System.out.println();
		i=1;
		do{
		 System.out.print(i+" ");
		 i++;
		}while(i<n);
	}
}
