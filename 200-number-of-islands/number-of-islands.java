class Solution {

    private void dfs(int r, int c, char[][] grid) {

        if (r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] == '0')
            return;
        
        grid[r][c] = '0';

        dfs(r + 1, c, grid);
        dfs(r - 1, c, grid);
        dfs(r, c + 1, grid);
        dfs(r, c - 1, grid);

    }

    public int numIslands(char[][] grid) {

        if (grid == null || grid.length == 0)
            return 0;

        int R = grid.length;
        int C = grid[0].length;

        int count = 0;

        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                if (grid[r][c] == '1') {
                    dfs(r, c, grid);
                    count++;
                }
            }
        }
    
        return count;

    }
}