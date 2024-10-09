class Solution {
    public int minFlips(int a, int b, int c) {
        int f = 0;

        while (a > 0 || b > 0 || c > 0) {
            int b_a = a & 1,
                b_b = b & 1,
                b_c = c & 1;

            if (b_c == 0)
                f += (b_a + b_b);
            else
                if (b_a == 0 && b_b == 0)
                    f += 1;

            a = a >> 1;
            b = b >> 1;
            c = c >> 1;
        }
        return f;
    }
}