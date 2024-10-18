class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length())
            return false;

        return _isIsomorphic(s, t) && _isIsomorphic(t, s);
    }

    private boolean _isIsomorphic(String s, String t) {

        Map<Character, Character> map = new HashMap<>();

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        for (int i = 0; i < a.length; i++) {
            char x = a[i];
            char y = b[i];
            if (map.containsKey(x))
                if (map.get(x) != y)
                    return false;
            map.put(x, y);
        }
        return true;
    }

}