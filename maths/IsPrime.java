import java.util.*;
public class IsPrime
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    boolean isPrime[]=seiveofEratosthenes(n);
	    int c=0;
	    for(int i=0;i<=n;i++)
	    {
		if(isPrime[i]) {  
		  c++;
		  System.out.print(i+" ");
	    }
	    }
	    System.out.println();
	    System.out.println("count : "+c);
	}
    static boolean[] seiveofEratosthenes(int n){
	    boolean isPrime[]=new boolean[n+1];
	    Arrays.fill(isPrime,true);
	    isPrime[0]=false;
	    isPrime[1]=false;
	    for(int i=2;i*i<=n;i++){
	        for(int j=2*i;j<=n;j+=i){
	            isPrime[j]=false;
	        }
	    }
	   return isPrime; 
	}
}
