class Solution {

    void dfs(int s, boolean[] vis, List<List<Integer>> rooms) {

        if (vis[s])
            return;

        vis[s] = true;

        List<Integer> keys = rooms.get(s);

        for (int k = 0; k < keys.size(); k++) {
            dfs(keys.get(k), vis, rooms);
        }

    }

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();

        boolean[] vis = new boolean[n];

        dfs(0, vis, rooms);

        System.out.println(Arrays.toString(vis));

        for (int i = 0; i < n; i++) {
            if (!vis[i])
                return false;
        }

        return true;

    }
}