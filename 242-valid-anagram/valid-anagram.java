class Solution {
    public boolean isAnagram(String s, String t) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        char[] b = t.toCharArray();
        Arrays.sort(b);

        s = String.valueOf(a);
        t = String.valueOf(b);

        return s.equals(t);
    }
}