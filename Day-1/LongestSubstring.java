import java.util.*;
public class Main
{
    public static void main(String[] args) {
        String s = "abcdabecbfb";

        
        if (s == null || s.isEmpty()) {
            return;
        }

        int maxLength = 0;
        int start = 0;
        int maxStart = 0;
        int maxEnd = 0;
        HashSet<Character> charSet = new HashSet<>();

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

            while (charSet.contains(currentChar)) {
                charSet.remove(s.charAt(start));
                start++;
            }

            charSet.add(currentChar);

            if (end - start + 1 > maxLength) {
                maxLength = end - start + 1;
                maxStart = start;
                maxEnd = end;
            }
        }

        String result = s.substring(maxStart, maxEnd + 1);

        System.out.println("Longest Substring Without Repeating Characters: " + result);
    }
}
