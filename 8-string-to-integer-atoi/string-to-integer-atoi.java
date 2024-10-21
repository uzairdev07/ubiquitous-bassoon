class Solution {
    public int myAtoi(String s) {
        s = s.trim();

        if (s.length() == 0)
            return 0;
        
        boolean neg = s.charAt(0) == '-';
        boolean pos = s.charAt(0) == '+';

        int i = (neg || pos) ? 1 : 0;
        return solve(s, i, 0, neg);

    }

    int solve(String s, int i, int res, boolean neg) {
        if (i >= s.length() || !Character.isDigit(s.charAt(i)))
            return neg ? -res : res;

        int digit = s.charAt(i)-'0';
        
        if (res > Integer.MAX_VALUE/10 || (res == Integer.MAX_VALUE/10 && digit > Integer.MAX_VALUE%10))
            return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;

        res = res * 10 + digit;
        
        return solve(s, i+1, res, neg);
    }

}