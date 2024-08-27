class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;

       char[] charArray = s.toCharArray();

        Map<Character, Integer> map = new HashMap<>();
        int i = 0, j = 0;
        while (j < charArray.length) {
            char cr = charArray[j];
            if (map.containsKey(cr) && map.get(cr) >= i) {
                i = map.get(cr) + 1;
            }
            max = Math.max(max, j - i + 1);
            map.put(cr, j++);
        }
        return max;
    }
}