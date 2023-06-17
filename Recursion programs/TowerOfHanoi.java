import java.util.Scanner;

public class TowerOfHanoi{
    public static void func(int n,String src,String helper,String dest){  
    if(n==1){
        System.out.println("transfer disk "+n+" from "+src+" to "+dest);
        return;
    }
    func(n-1,src,dest,helper);
    System.out.println("transfer disk "+n+" from "+src+" to "+dest);
    func(n-1,helper,src,dest);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        func(n,"S","H","D");
    }
}
//Complexity O(2^n)