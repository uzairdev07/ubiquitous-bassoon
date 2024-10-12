class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        if (n <= 2)
            return n;

        int max = 0;
        for (int i = 0; i < n; i++) {
            HashMap<Double, Integer> map = new HashMap<>();
            for (int j = 0; j < n; j++) {
                if (i==j)
                    continue;
                int x1 = points[i][0];
                int y1 = points[i][1];

                int x2 = points[j][0];
                int y2 = points[j][1];

                double slope = (double)(y2-y1) / (double)(x2-x1);
                map.put(slope, map.getOrDefault(slope,1)+1);
                max = Math.max(max, map.get(slope));
            }
        }
        return max;
    }
}