class Solution {
    public int[] searchRange(int[] nums, int target) {

        int l = 0, r = nums.length-1;
        int[] res = {-1, -1};
       
        while (l <= r) {
            int mid = (l + r) / 2;

            if (nums[mid] == target) {
                int i = mid-1;
                while (i >= 0 && nums[i] == nums[mid])
                    i--;
                res[0] = (i+1);

                int j = mid+1;
                while (j < nums.length && nums[j] == nums[mid]) {
                    j++;
                }
                res[1] = j-1;

                return res;
            }
            if (nums[mid] < target)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return res;
    }
}