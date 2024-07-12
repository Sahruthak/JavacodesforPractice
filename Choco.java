/*Given an array of N integers where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets such that: 
  Each student gets one packet.
  The difference between the number of chocolates in the packet with maximum chocolates and the packet with minimum chocolates given to the students is minimum. less complexity solution
*/


import java.util.*;
import java.util.Arrays;
public class Choco
{
    public static int mindifference(int[] packets,int m) 
    {
    if(m<=0 ||packets.length==0 || m>packets.length)
    {
        return 0;
    }
    Arrays.sort(packets);
    
    int start=0;
    int mindifference=Integer.MAX_VALUE;
    
    for(int i=start;i+m-1<packets.length;i++)
    {
       int diff=packets[i+m-1]-packets[i];
       mindifference=Math.min(mindifference,diff);
    }
    return mindifference;
    }

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int packets[]=new int[100];
	    for(int i=0;i<n;i++)
	    {
	        packets[i]=sc.nextInt();
	    }
	    int m=sc.nextInt();
	    
	    int mindiff=mindifference(packets,m);
	    
	    System.out.println("MIN DIFFERNCE IS  "+mindiff);
	}
}
