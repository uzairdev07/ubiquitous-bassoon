class Solution {
    public String reverseParentheses(String s) {
        Stack<StringBuilder> st = new Stack<>();
        StringBuilder crr = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                st.push(crr);
                crr = new StringBuilder();
            } else if (c == ')') {
                crr = crr.reverse();
                StringBuilder temp = st.pop();
                temp.append(crr);
                crr = temp;
            } else {
                crr.append(c);
            }
        }
        return crr.toString();
    }

}