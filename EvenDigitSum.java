public class EvenDigitSum {
    public static void main(String[] args) {
        int number=56213;
        System.out.println(getEvenDigitSum(number));
    }
    public static int getEvenDigitSum (int number){
        if (number < 0) return -1 ;
        int ans = 0 ;
        int temp = number ;
        while (temp != 0){
            int digit = temp%10 ;
            if(digit % 2 == 0)
                ans += digit ;
            temp = temp/10 ;
        }
        return ans ;
    }
}


