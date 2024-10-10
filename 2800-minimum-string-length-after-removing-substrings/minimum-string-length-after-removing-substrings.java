class Solution {
    public int minLength(String s) {
        StringBuilder sb = new StringBuilder(s);

        while (sb.length() > 0) {
            int i = sb.indexOf("AB");
            if (i == -1)
                i = sb.indexOf("CD");
            if (i==-1)
                break;
            sb.replace(i, i+2, "");

        }
        return sb.length();

    }
}