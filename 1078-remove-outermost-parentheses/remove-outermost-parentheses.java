class Solution {
    public String removeOuterParentheses(String s) {
        String res = "";
        int bal = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                if (bal > 0)
                    res += c;   
                bal++;
            } else {
                bal--;
                if (bal > 0)
                    res += c;
            }
        }
        return res;

    }
}