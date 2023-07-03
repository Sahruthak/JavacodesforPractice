/*
matrix path problem
*/

public class MatrixPath
{
	public static void main(String[] args) {
	    int count=pathCount(2,2);
		System.out.println("count "+count);
	}	
	static int pathCount(int n,int m){
	    if(n==1||m==1) return 1;
	    return pathCount(n,m-1)+pathCount(n-1,m);
	}
}
