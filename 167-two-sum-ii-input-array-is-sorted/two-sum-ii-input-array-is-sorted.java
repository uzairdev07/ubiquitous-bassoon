class Solution {
    public int[] twoSum(int[] nums, int t) {
        int s = 0, e = nums.length - 1;

        while (s < e) {
            int curr = nums[s] + nums[e];
            if (curr > t)
                e--;
            else if (curr < t)
                s++;
            else
                break;
        }
        return new int[]{s + 1, e + 1};
    } 
}