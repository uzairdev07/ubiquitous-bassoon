class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;

        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = i; j < charArray.length; j++) {
                if (sb.indexOf(String.valueOf(s.charAt(j))) != -1) {
                    break;
                }
                sb.append(s.charAt(j));
                max = Math.max(max, sb.length());
            }
        }
        return max;
    }
}