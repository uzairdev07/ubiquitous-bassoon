class Solution {
    public String largestOddNumber(String num) {
        char[] a = num.toCharArray();

        if (isOdd(a[a.length-1]))
            return num;

        int i = 0;
        int max = -1;
        for (char c : a) {
            if (isOdd(c)) {
                max = Math.max(max, i);
            }
            i++;
        }
        if (max == -1)
            return "";
        return num.substring(0, max+1);
    }

    private boolean isOdd(char c) {
        return Integer.parseInt(String.valueOf(c)) % 2 == 1;
    }
}