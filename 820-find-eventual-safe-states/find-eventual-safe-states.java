class Solution {
    private boolean dfs(int s, boolean[] vis, boolean[] inStack, int[][] graph) {
        if (inStack[s])
            return true;
        if (vis[s])
            return false;
        vis[s] = true;
        inStack[s] = true;
        for (int i : graph[s])
            if (dfs(i, vis, inStack, graph))
                return true;
        inStack[s] = false;
        return false;
    }

    public List<Integer> eventualSafeNodes(int[][] graph) {
        List<Integer> res = new ArrayList<>();
        int n = graph.length;
        boolean[] vis = new boolean[n],
                inStack = new boolean[n];
        for (int i = 0; i < graph.length; i++)
            dfs(i, vis, inStack, graph);
        for (int i = 0; i < n; i++)
            if (!inStack[i])
                res.add(i);
        return res;

    }
}