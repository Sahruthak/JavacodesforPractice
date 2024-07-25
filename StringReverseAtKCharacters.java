class Solution {
    public String reverseStr(String s, int k) {
        String st = "";
        int l = 0, e = 0;
        while (l < s.length()) {
            e = Math.min(l + k, s.length());
            st = st + reverse(s.substring(l, e));
            if (e + k <= s.length()) {
                st = st + s.substring(e, Math.min(e + k, s.length()));
            } else {
                st = st + s.substring(e);
            }
            l = e + k;
        }
        return st;
    }
    public String reverse(String s){
        char[] arr = s.toCharArray();
        int left = 0, right = arr.length - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return new String(arr);
    }
}
