public class Main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5, 8, 7, 6};
        int seclarge = 0;
        int large = a[0];
        
        for (int i = 1; i < a.length; i++) {
            if (a[i] > large) {
                seclarge = large;
                large = a[i];
            } else if (a[i] > seclarge && a[i] < large) {
                seclarge = a[i];
            }
        }
        
        System.out.println("Second Largest Element: " + seclarge);
    }
}
