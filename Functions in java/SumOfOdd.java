import java.util.*;
public class SumOfOdd
{
    public static int avg(int n){
        int Avg=0;
        for(int i=1;i<=n;i++){
        if(i%2!=0)
          Avg+=i;
        }
        return Avg;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    System.out.println("Sum of "+ 1 +" to "+ a +" is "+avg(a));
       }
}