class Solution {

    void dfs(int s, int t, List<Integer> temp, int[][] graph, List<List<Integer>> res) {
        
        temp.add(s);

        if (s == t) {
            List<Integer> x = new ArrayList<>(temp);
            res.add(x);
        } else {
            int[] childs = graph[s];
            for (int child : childs) {
                dfs(child, t, temp, graph, res);
            }
        }

        temp.removeLast();

    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph)
    {
        int N = graph.length;

        int source = 0;
        int target = N - 1;

        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();

        dfs(source, target, temp, graph, res);

        return res;

    }
}