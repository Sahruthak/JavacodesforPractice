import java.util.*;
public class Stringlen
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    int len=str.length();
	    int count=0;
		System.out.println("number of characters with spaces :"+len);
		for(int i=0;i<len;i++){
		    if(str.charAt(i)!=' ') count++;
		}
		System.out.println("number of characters without spaces :"+count);
		int c=0;
		for(int i=0;i<len;i++){
		    if(str.charAt(i)=='!'||str.charAt(i)=='.'|| str.charAt(i)=='-'||str.charAt(i)==','|| str.charAt(i)=='"'
		    ||str.charAt(i)=='?'||str.charAt(i)=='/'||str.charAt(i)==':'||str.charAt(i)=='|'||str.charAt(i)==';')
		    c++;
		    
		}
		System.out.println("number of punctuations :"+c);
	}
}
