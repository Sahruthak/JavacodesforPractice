import java.util.*;
public class Elevator
{
	public static void main(String[] args) {
	    
	    int elevator1 =(int) (Math.random()*10);
	    int elevator2 =(int) (Math.random()*10);
	    int presentfloor=4;
	    int close=closest(presentfloor,elevator1,elevator2);
		System.out.println("Send elevator at "+close+" floor to "+presentfloor+" floor");
		
	}
	
	public static int closest(int presentfloor,int elevator1,int elevator2){
	    int dist1=Math.abs(presentfloor-elevator1);
	    int dist2=Math.abs(presentfloor-elevator2);
	    
	    return dist1<dist2 ? elevator1 : elevator2;
	}
	
}
