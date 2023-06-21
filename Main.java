import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String str=sc.nextLine();
	    for(int i=str.length()-1;i>=0;i--)
		System.out.print(str.charAt(i));
		
	int count=0;	
	char ch=sc.next().charAt(0);
	for(int i=0;i<str.length();i++){
		if(str.charAt(i)==ch){
		    count++;
		}
	}
        System.out.print(count);
        
        
	    int r,rev=0,i,n,num;
	    n=sc.nextInt();
	    num=n;
	    while(n>0) 
	    {
	        r=n%10;
	        rev=rev*10+r;
	        n=n/10;
	    }
	    if(num==rev)
	    System.out.println("Palindrome");
	    else
	    System.out.println("Not Palindrome");
	    
	    
	    int a[]=new int[100];
	    int m=sc.nextInt();
	    for(int l=0;l<m;l++){
	        a[l]=sc.nextInt();
	    }
	    for(int l=0;l<m;l++){
	        for(int j=0;j<m-1-l;j++){
	            if(a[j]>a[j+1]){
	                int temp=a[j];
	                a[j]=a[j+1];
	                a[j+1]=temp;
	            }
	            
	        }
	    }
	    for(int l=0;l<m;l++){
	        System.out.print(a[l]+" ");
	    }
	}
}








