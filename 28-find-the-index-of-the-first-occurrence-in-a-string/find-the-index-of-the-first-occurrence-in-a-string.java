class Solution {
    public int strStr(String a, String b) {
        // return haystack.indexOf(needle);
        int l1 = a.length(), l2 = b.length();

        if (l2 == 0)
            return 0;
        
        if (l1 < l2)
            return -1;

        for (int i = 0; i <= l1 - l2; i++) {
            if (a.substring(i, i + l2).equals(b))
                return i;
        }
        return -1;
    }
}