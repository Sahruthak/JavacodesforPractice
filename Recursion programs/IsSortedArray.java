import java.util.Scanner;

public class IsSortedArray {
    public static boolean func(int arr[],int ind) {
        if(ind==arr.length-1) {
             return true; 
         }
         if(arr[ind] <= arr[ind+1]){
            return func(arr,ind+1);
         } else {
            return false;
         }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(func(arr,0));
    }   
}
