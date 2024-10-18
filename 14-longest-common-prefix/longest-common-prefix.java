class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        char[] f = strs[0].toCharArray();
        char[] l = strs[strs.length-1].toCharArray();
    
        String ans = "";
        for (int i = 0; i < f.length; i++) {
            if (f[i] != l[i])
                break;
            ans+=f[i];
        }
        return ans;
    }
}