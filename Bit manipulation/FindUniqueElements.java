import java.util.*;

public class FindUniqueElements {
    public static void findUniqueElements(int[] nums) {
        int  xor = 0;
        for (int num : nums) {
            xor ^= num;
        }
        int rightmostBit = xor & -xor;  

        int num1=0;
        int num2=0;
        for(int num:nums){
            if((num & rightmostBit)==0){
                num1=num1^num;
            }
            else{
                num2=num2^num;
            }
        }

        System.out.println("Unique elements: " + num1 + " and " + num2);
    }
        public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int a[]=new int[n];
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	    }
        findUniqueElements(a);
    }
}


