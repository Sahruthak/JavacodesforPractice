import java.util.Scanner;


public class FirstAndLastOccurence   {
    public static int first=-1;
    public static int last=-1;
    public static void func(String str,int start,char element)
    {
        if(start==str.length()) { 
        System.out.println("First "+first);
        System.out.println("Last "+last);
        return; 
        }
        char current=str.charAt(start);
        if(current==element) { 
        if(first==-1){
        first=start;
        } else {
        last=start;
        }
    }
       func(str,start+1,element); 
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char element=sc.next().charAt(0);
        func(str,0,element);
    }
}
