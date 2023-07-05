public class Samestring
{
	public static void main(String[] args) {
	    String str="abcdba";
		System.out.println("String is a plaindrome "+samestring(str));
	}
	static boolean samestring(String str){
	int n=str.length();
	for(int i=0;i<n/2;i++){
	if(str.charAt(i)!=str.charAt(n-i-1)) 
	    return false;
	}
	return true;
	}
}
