class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();

        String t = "";
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c))
                t += c;
        }

        char[] a = t.toCharArray();
        int n = t.length();
        int l = 0;
        int r = n-1;
        while (l<r) {
            if (a[l] != a[r])
                return false;
            l++;
            r--;
        }
        return true;
    }
}