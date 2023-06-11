import java.util.*;
class MaxSubArray
{
    public static int maxdifference(int arr[]) {
        int currentsum=arr[0];
        int maxsum=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            currentsum=Math.max(arr[i],currentsum+arr[i]);
            maxsum=Math.max(maxsum,currentsum);
        }
        return maxsum;
    }
   public static void main(String args[]) 
   {
   Scanner sc=new Scanner(System.in);
   int n,i;
   n=sc.nextInt();
   int arr[]=new int[n+1];
   for(i=0;i<n;i++)
   {
     arr[i]=sc.nextInt();
   }
   int max=maxdifference(arr);
   System.out.println("MAX SUM:"+max);
   }
}