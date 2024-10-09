class Solution {
    public void gameOfLife(int[][] b) {
        int n = b.length;
        int m = b[0].length;

        int[][] t = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                t[i][j] = solve(i, j, b, n, m);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                b[i][j] = t[i][j];
            }
        }
    }

    int solve(int i, int j, int[][] board, int n, int m) {
        int count = 0;
        int x = board[i][j];

        for (int di = -1; di <= 1; di++) {
            for (int dj = -1; dj <= 1; dj++) {
                if (di == 0 && dj == 0)
                    continue;

                int ni = i + di;
                int nj = j + dj;

                if ((ni >= 0 && ni < n) && (nj >= 0 && nj < m))
                    count += board[ni][nj] == 1 ? 1 : 0;
            }
        }

        if (x == 0)
            return count == 3 ? 1 : 0;
        else
            return (count == 2 || count == 3) ? 1 : 0;
    }
}