class Solution {
    public int equalPairs(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        HashMap<String, Integer> hash = new HashMap<>();
        for (int i = 0; i < n; i++) {
            StringBuilder temp = new StringBuilder();
            for (int j = 0; j < m; j++) {
                temp.append(grid[i][j]).append("0");
            }
            String t = temp.toString();
            hash.put(t, hash.getOrDefault(t, 0)+1);
        }

        int count = 0;
        for(int c = 0; c < m; c++) {
            StringBuilder temp = new StringBuilder();
            for (int i = 0; i < n; i++) {
                temp.append(grid[i][c]).append("0");
            }
            if (hash.getOrDefault(temp.toString(), 0) > 0) {
                count += hash.get(temp.toString());
                hash.remove(temp);
            }
        }

        return count;
    }
}