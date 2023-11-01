class Prime {
    public static void main(String[] args) {
        int m = 2;
        int c = 0;
        for (int i = 2; i <= Math.sqrt(m); i++) { // Change the loop condition
            if (m % i == 0) {
                c++;
            }

            if (c > 1) {
                System.out.println("not prime");
                break;
            }
        }

        if (c <= 1) { // Check if c is less than or equal to 1
            System.out.println("Prime");
        }
    }
}
