//reverse of an array
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int n,i;
	    Scanner sc=new Scanner (System.in);
	    n=sc.nextInt();
	    int arr[]=new int[100];
	    for(i=0;i<n;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    for(i=n-1;i>=0;i--) {
		System.out.print(arr[i]+" ");
	    }
		}
}
