class Solution {

    int ans = 0;
    private void dfs(int i, int j, int[][] grid) { 
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0)
            return;

        grid[i][j] = 0;

        dfs(i + 1, j, grid);
        dfs(i - 1, j, grid);
        dfs(i, j + 1, grid);
        dfs(i, j - 1, grid);

    }

    public int numEnclaves(int[][] grid) {

        if (grid == null || grid[0].length == 0)
            return 0;

        int R = grid.length;
        int C = grid[0].length;

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (grid[i][j] == 1) {
                    if (i == 0 || j == 0 || i == R - 1 || j == C - 1)
                        dfs(i, j, grid);
                }
            }
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (grid[i][j] == 1) {
                    ans++;
                }
            }
        }

        return ans;

        
    }
}