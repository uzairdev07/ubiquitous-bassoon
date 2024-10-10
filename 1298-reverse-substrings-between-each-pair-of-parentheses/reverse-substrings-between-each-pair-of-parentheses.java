class Solution {
    public String reverseParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()) {
            if (ch == '(') {
                st.push(sb.length());
            } else if (ch == ')') {
                int start = st.pop();
                reverse(sb, start, sb.length() - 1);
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    void reverse(StringBuilder sb, int s, int e) {
        while (s < e) {
            char t = sb.charAt(s);
            sb.setCharAt(s++, sb.charAt(e));
            sb.setCharAt(e--, t);
        }
    }

}