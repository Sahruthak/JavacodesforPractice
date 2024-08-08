public class LastDigitChecker {
    public static void main(String[] args) {
        boolean ans=hasSameLastDigit(20,53,23);
        System.out.println(ans);
    }
    public static boolean hasSameLastDigit(int a, int b, int c) {
        if(a<10 || b<10 || c<10 || a>1000 || b>1000 ||c>1000)  return false;
        int lastDigitA = a % 10;
        System.out.println(lastDigitA);
        int lastDigitB = b % 10;
        int lastDigitC = c % 10;
        return (lastDigitA == lastDigitB || lastDigitA == lastDigitC || lastDigitB == lastDigitC);
    }
}
