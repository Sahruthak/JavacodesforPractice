import java.io.*;
import java.util.*;

public class StringPalindrome {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        if(isAnagram(A)){
            System.out.println("Yes");
        }
        else{
        System.out.println("No");
        }
        
    }
        public static boolean isAnagram(String A){
        int n=A.length();
        for(int i=0;i<n/2;i++) 
        {
        if(A.charAt(i)!=A.charAt(n-i-1))
            return false;
            break;
        }
        return true;
        }

}