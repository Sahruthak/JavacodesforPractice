import java.util.Scanner;

public class StringPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int currind = 0;
        int strlen = str.length();
        backtrack(str.toCharArray(), currind, strlen);
    }

    private static void backtrack(char[] chars, int currind, int strlen) {
        if (currind == strlen) {
            System.out.print(new String(chars) + " ");
            return;
        }
        for (int i = currind; i < strlen; i++) {
            chars = swap(chars, currind, i);
            backtrack(chars, currind + 1, strlen);
            chars = swap(chars, currind, i);
        }
    }

    static char[] swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }
}
