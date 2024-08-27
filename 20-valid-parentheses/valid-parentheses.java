class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (char c : s.toCharArray()) {
            if (isOpening(c))
                st.push(c);       
            else {
                if (!st.isEmpty()) {
                    char t = st.pop();
                    if (!isMatch(c, t))
                        return false;
                } else 
                    return false;
            } 
        }
        return st.isEmpty();
    }

    private boolean isOpening(char c) {
        return c == '(' || c == '{' || c == '[';
    }

    private boolean isMatch(char c, char t) {
        return (c == ')' && t == '(') ||
                (c == '}' && t == '{') || 
                (c == ']' && t == '[');
    }

}