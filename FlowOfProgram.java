import java.util.Scanner;
public class FlowOfProgram{
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        leapyear(n);
        int m=sc.nextInt();
        int k=sc.nextInt();
        sum(m,k);
        int l=sc.nextInt();
        table(l);
    }
    public static void leapyear(int n){
        if(n%4==0 && n%100!=0){
            System.out.println("Leap year");
        }
         else if(n%400==0 && n%100==0){
            System.out.println("leap year");
        }
         else{
            System.out.println("Not leap year");
        }
    }
    public static void sum(int m,int k){
            System.out.println("sum "+(m+k));
   }
    public static void table(int l){
        for(int i=1;i<=10;i++){
            System.out.print(l+" * "+i+" = "+i*l+"   ");
   }
 }
}
