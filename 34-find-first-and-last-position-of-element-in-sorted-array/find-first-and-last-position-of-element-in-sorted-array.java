class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[] {
            bs(nums, target, true),
            bs(nums, target, false),
        };
    }

    private int bs(int[] nums, int target, boolean isLeft) {
        int n = nums.length;
        int l = 0, r = n - 1;
        int index = -1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] == target) {
                index = m;
                if (isLeft)
                    r = m - 1;
                else
                    l = m + 1;
            }
            else if (nums[m] < target) {
                l = l + 1;
            } else {
                r = r - 1;
            }
        }

        return index;

    }

}