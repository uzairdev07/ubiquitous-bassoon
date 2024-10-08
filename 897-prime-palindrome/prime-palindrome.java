class Solution {
    public int primePalindrome(int n) {
        if (n <= 1)
            return 2;
        int i = n;
        while (n > 0) {
            if (isPal(i) && isPrime(i))
                return i;
            i++;
            if (i > 10_000_000 && i< 100_000_000) {
            i = 100_000_000; 
            }
        }
        return 0;
     }

    private boolean isPal(int n) {
        String s = String.valueOf(n);
        
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r))
                return false;
            l++;
            r--;
        }
        return true;
    }

    private boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}