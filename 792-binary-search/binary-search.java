class Solution {
    public int search(int[] nums, int target) {
        Arrays.sort(nums);

        int n = nums.length;
        int l = 0, r = n - 1;

        while (l <= r) {
            int mid = (l + r) / 2;
            if (nums[mid] < target) {
                l = mid + 1;
            } else if (nums[mid] > target) {
                r = mid - 1;
            } else
                return mid;
            
        }
        return -1;

    }
} 