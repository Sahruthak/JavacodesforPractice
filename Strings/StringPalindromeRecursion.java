import java.util.*;
public class StringPalindromeRecursion
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    int l=0;
	    int n=str.length()-1;
		System.out.println("String is a plaindrome "+samestring(str,l,n));
	}
	static boolean samestring(String str,int l,int n){
	if(l>=n){
	    return true;
	}
	if(str.charAt(l)!=str.charAt(n)) {
	    return false;
	}
	   return samestring(str,l+1,n-1);
	}
}
