import java.util.*;
public class Average
{
    public static int avg(int a,int b,int c){
        int Avg=(a+b+c)/2;
        return Avg;
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int c=sc.nextInt();
	    System.out.println("Average : "+avg(a,b,c));
       }
}




