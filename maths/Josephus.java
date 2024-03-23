/**
Josephus problem
**/

public class Josephus
{
	public static void main(String[] args) {
	    int ans=josephus(5,3);
		System.out.println("Alive "+ans);
	}
	static int josephus(int n,int k){
	if(n==1) return 0;
	return (josephus(n-1,k)+k)%n;
	}
	
}

