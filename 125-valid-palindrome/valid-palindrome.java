class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String t = "";
        for (char c : s.toCharArray()) {
            if ((c >= 'a' && c <= 'z') || Character.isDigit(c))
                t += c;
        }
        int l = 0, r = t.length() - 1;
        char[] chr = t.toCharArray();
        while (l < r) {
            if (chr[l] != chr[r])
                return false;
            r--;
            l++;
        }
        return true;
    }
}