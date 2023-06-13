import java.util.*;
public class Table
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int i;
	    int n=sc.nextInt();
	    for(i=1;i<11;i++) {
		System.out.print(n+"*"+i+"="+n*i+"  ");
	    }
	    System.out.println();
	    i=1;
		while(i<11)
		{
		 System.out.print(n+"*"+i+"="+n*i+"  ");
		 i++;
		}
		System.out.println();
		i=1;
		do{
		 System.out.print(n+"*"+i+"="+n*i+"  ");
		 i++;
		}while(i<11);
	}
}
