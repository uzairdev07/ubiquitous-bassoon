class Solution {
    public String longestCommonPrefix(String[] strs) {
        String start = strs[0];

        String ans = "";
        for (char c : start.toCharArray()) {
            String temp = ans+c;
            for (String s : strs) {
                if (!s.startsWith(temp))
                    return ans;
            }
            ans += c;
        }
        return ans;
    }
}