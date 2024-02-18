class Solution {
    public int primePalindrome(int n) {
        if (n >= 8 && n <= 11) return 11;
        for (int i = 1; i < 100000; i++) {
            String s = Integer.toString(i), r = new StringBuilder(s).reverse().toString();
            int y = Integer.parseInt(s + r.substring(1));
            if (y >= n && isPrime(y)) return y;
        }
        return -1;
    }

    private boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++)
            if (num % i == 0) return false;
        return true;
    }

}