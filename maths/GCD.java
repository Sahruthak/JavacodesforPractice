import java.util.*;
public class GCD
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int num=gcd(a,b);
	    System.out.println("GCD of "+a+" and "+b+" is "+ num);
	}
    static int gcd(int a,int b){
	    if(b==0) return a;
	    return gcd(b,a%b);
	}
}


 
/*

{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int num=gcd(a,b);
	    System.out.println("GCD of "+a+" and "+b+" is "+ num);
	}
    static int gcd(int a,int b){
	    while(a>0 && b>0){
	    if(a>b){
	        a=a-b;
	    }else{
	        b=b-a;
	    }
	    }
	    if(a==0) return b;
	    else return a;
	}
}

*/ 