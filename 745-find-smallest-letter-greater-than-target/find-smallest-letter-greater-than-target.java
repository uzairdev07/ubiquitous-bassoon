class Solution {
    public char nextGreatestLetter(char[] lts, char target) {
        Arrays.sort(lts);

        int l = 0, r = lts.length - 1;
        int m = 0;

        while (l <= r) {
            m = l + (r - l) / 2;            
            if (lts[m] <= target)
                l = m + 1;
            else
                r = m - 1;
        }

        return l < lts.length ? lts[l] : lts[0];

    }
}