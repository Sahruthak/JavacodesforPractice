public class FirstAndLastSum{
    public static void main(String[] args) {
        int number=123;
        System.out.println(sumFirstAndLastDigit(number));
    }
    public static int sumFirstAndLastDigit(int number){
        if(number<0) return -1;
        int lastnum=number%10;
        int firstnum=number;
        while(firstnum>0){
            if(firstnum>=10){
                firstnum=firstnum/10;
            }else break;
        }

        int sum=firstnum+lastnum;
        return sum;
    }
}