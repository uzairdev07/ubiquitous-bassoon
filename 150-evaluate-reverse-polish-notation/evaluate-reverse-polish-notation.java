class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st = new Stack<>();

        for (String ch : tokens) {
            if (isOperator(ch)) {
                if (st.size() > 1) {
                    int a = st.pop();
                    int b = st.pop();
                    int r = eval(a, b, ch);
                    st.push(r);
                }
            } else {
                int x = Integer.parseInt(ch);
                st.push(x);
            }
        }

        return st.pop();

    }

    public int eval(int a, int b, String op) {
        switch (op) {
            case "+":
                return a + b;
            case "-":
                return b - a;
            case "*":
                return a * b;
            case "/":
                return b / a;
        }
        return 0;
    }

    public boolean isOperator(String op) {
        return op.equals("+") ||
                op.equals("-") ||
                op.equals("*") ||
                op.equals("/");
    }

}