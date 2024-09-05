class Solution {

    void dfs(int r, int c, boolean[][] vis, int curr, int[][] heights) {
        if (r < 0 || c < 0 || r == heights.length || c == heights[0].length || vis[r][c] || curr > heights[r][c])
            return;

        vis[r][c] = true;

        dfs(r + 1, c, vis, heights[r][c], heights);
        dfs(r - 1, c, vis, heights[r][c], heights);
        dfs(r, c + 1, vis, heights[r][c], heights);
        dfs(r, c - 1, vis, heights[r][c], heights);

    }

    public List<List<Integer>> pacificAtlantic(int[][] heights) {

        List<List<Integer>> result = new ArrayList<>();

        if (heights.length == 0 || heights[0].length == 0)
            return result;

        int R = heights.length;
        int C = heights[0].length;

        boolean[][] pac = new boolean[R][C];
        boolean[][] atl = new boolean[R][C];

        // TOP and BOTTOM ROW
        for (int i = 0; i < C; i++) {
            dfs(0, i, pac, heights[0][i], heights);
            dfs(R - 1, i, atl, heights[R - 1][i], heights);
        }

        for (int i = 0; i < R; i++) {
            dfs(i, 0, pac, heights[i][0], heights);
            dfs(i, C - 1, atl, heights[i][C - 1], heights);
        }

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (pac[i][j] && atl[i][j])
                    result.add(List.of(i, j));
            }
        }

        return result;

    }
}