class Solution {

    private int sWindow(int[] nums, int goal) {
        int l = 0, r = 0, cnt = 0, res = 0; 
        while (r < nums.length) {
            cnt += nums[r];
            while (l <= r && cnt > goal)
                cnt -= nums[l++];
            res += r - l + 1;
            r++;
        }
        return res;
    }

    public int numSubarraysWithSum(int[] nums, int goal) {
       return sWindow(nums, goal) - sWindow(nums, goal-1);
    }
}