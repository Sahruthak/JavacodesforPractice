import java.util.Scanner;

public class DSA {
    public static void func(String str,int n,int count,String newstr)
    {
        if(n==str.length()) {
        for(int i=0;i<count;i++) {
            newstr+='x';
        }
        System.out.print(newstr);
        return ;
       }
       char currchar=str.charAt(n);
       if(currchar=='x'){
        count++;
       } else {
        newstr+=currchar;
       } 
       func(str,n+1,count,newstr);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();   
        func(str,0,0,"");
    }
}