class Solution {
    public int numberOfSubstrings(String s) {
        int l = 0, r = 2;
        int n = s.length();
        int res = 0;
        while (l <= n-3) {
            while (r < n-1 && !containsABC(s.substring(l, r+1))) {
                r++;
            }

            if (containsABC(s.substring(l, r+1))) {
                res += n-r;
            }

            l++;
        }
        return res;
    }

    public boolean containsABC(String s) {
        return s.contains("a") && s.contains("b") && s.contains("c");
    }
}