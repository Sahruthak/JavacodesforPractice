public class GCD {
    public static void main(String[] args) {
        int ans=getGreatestCommonDivisor(13,30);
        System.out.println(ans);
    }
    public static int getGreatestCommonDivisor(int a,int b){
        if(a < 10 || b < 10){
            return -1;
        }
        int min= a<b ? a : b;
        int gcd=1;
        for(int i=2;i<=min;i++){
            if(a%i == 0 && b%i==0){
                gcd = i;
            }
        }
        return gcd;
    }
}
