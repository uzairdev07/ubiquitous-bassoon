class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for (int n : piles)
            max = Math.max(max, n);

        int l = 1, r = max;
        int ans = 0;
        while (l <= r) {
            
            int mid = (l+r)/2;

            int total = 0;
            for (int n : piles)
                total += Math.ceil(n*1.0 / mid);

            if (total <= h) {
                ans = mid;
                r = mid-1;
            } else
                l = mid+1;
        }
        return ans;
    }
}