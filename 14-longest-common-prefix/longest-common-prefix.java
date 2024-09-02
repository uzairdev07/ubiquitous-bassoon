class Solution {
    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 1)
            return strs[0];

        Arrays.sort(strs);

        StringBuilder sb = new StringBuilder();

        char[] f = strs[0].toCharArray();
        char[] l = strs[strs.length - 1].toCharArray();

        for (int i = 0; i < f.length; i++) {
            if (f[i] != l[i])
                break;
            sb.append(f[i]);
        }
        return sb.toString();
    }
}