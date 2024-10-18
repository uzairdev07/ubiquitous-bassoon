class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        char[] f = strs[0].toCharArray();
        char[] l = strs[strs.length-1].toCharArray();
    
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < f.length; i++) {
            if (f[i] != l[i])
                break;
            ans.append(f[i]);
        }
        return ans.toString();
    }
}