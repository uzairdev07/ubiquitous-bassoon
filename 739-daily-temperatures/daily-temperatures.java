class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];

        Stack<Integer> ind = new Stack<>();

        for (int i = n - 1; i >= 0; i--) {
            while (!ind.isEmpty() && temperatures[i] >= temperatures[ind.peek()]) {
                ind.pop();
            }
            if (!ind.isEmpty()) {
                res[i] = ind.peek() - i;
            }
            ind.push(i);
        }

        return res;
    }
}