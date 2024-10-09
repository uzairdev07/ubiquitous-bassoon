class Solution {
    public void setZeroes(int[][] m) {
        Map<String, Boolean> map = new HashMap<>();

        int R = m.length;
        int C = m[0].length;

        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                if (m[r][c] == 0)
                    map.put(r + " 0 " + c, true);
            }
        }
        for (Map.Entry<String, Boolean> e : map.entrySet()) {
            if (e.getValue() == false)
                continue;
                
            String k = e.getKey();
            int r = Integer.valueOf(k.substring(0, k.indexOf(" ")));
            int c = Integer.valueOf(k.substring(k.lastIndexOf(" ")+1));
            for (int i = 0; i < C; i++) {
                m[r][i] = 0;
            }
            for (int i = 0; i < R; i++) {
                m[i][c] = 0;
            }
            map.put(k, false);
        }
    }
}