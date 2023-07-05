import java.util.*;
public class Powerset
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    int currind=0;
	    String currstr=" ";
        powersetstring(str,currstr,currind);
	}
	static void powersetstring(String str,String currstr,int currind){
	int i=currind;
	if(i==str.length()){
	    System.out.print(currstr+" ");
	    return;
	}
	powersetstring(str,currstr+str.charAt(i),i+1);
	powersetstring(str,currstr,i+1);
	}
}
