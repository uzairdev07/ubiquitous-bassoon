class Solution {

    int dfs(int i, int j, int[][] grid) { 
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0)        
            return 0;

        grid[i][j] = 0;
        int r = 1;
        r += dfs(i + 1, j, grid);
        r += dfs(i - 1, j, grid);
        r += dfs(i, j + 1, grid);
        r += dfs(i, j - 1, grid);

        return r;
    }

    public int maxAreaOfIsland(int[][] grid) {
        int R = grid.length;
        int C = grid[0].length;

        int ans = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (grid[i][j] == 1) {
                    ans = Math.max(dfs(i, j, grid), ans);
                }
            }
        }

        return ans;
 
    }
}