public class Solution {
    public String longestPalindrome(String s) {
        if (s.equals(new StringBuilder(s).reverse().toString())) return s;

        int start = 0, size = 1;
        for (int i = 1; i < s.length(); i++) {
            int l = i - size;
            int r = i + 1;
            if (l - 1 >= 0 && s.substring(l - 1, r).equals(new StringBuilder(s.substring(l - 1, r)).reverse().toString())) {
                start = l - 1;
                size += 2;
            } else if (l >= 0 && s.substring(l, r).equals(new StringBuilder(s.substring(l, r)).reverse().toString())) {
                start = l;
                size += 1;
            }
        }

        return s.substring(start, start + size);
    }
}
