class Solution {
    public int searchInsert(int[] nums, int t) {
        int n = nums.length;
        int l = 0, r = n - 1;

        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] > t)
                r = m - 1;
            else if (nums[m] < t)
                l = m + 1;
            else
                return m;
        }
        return l;
    }
}