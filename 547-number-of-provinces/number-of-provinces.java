class Solution {

    public int findCircleNum(int[][] isConnected) {
        int V = isConnected.length;
        boolean[] vis = new boolean[V];

        int count = 0;

        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                count++;
                dfs(i, vis, isConnected);
            }
        }
        return count;
    }

    public void dfs(int node, boolean[] vis, int[][] isConnected) {        
        vis[node] = true;
        for (int i = 0; i < isConnected[node].length; i++) {
            if (!vis[i] && isConnected[node][i] == 1) {
                dfs(i, vis, isConnected);
            }
        }

    }

}