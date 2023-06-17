import java.util.Scanner;

public class ReverseString {
    public static void func(int n,String str)
    {
        if(n==0){
         System.out.print(str.charAt(n));
         return ;
       }
       System.out.print(str.charAt(n));
       func(n-1,str); 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        int n=str.length();
        func(n-1,str);
    }
}
//O(n)