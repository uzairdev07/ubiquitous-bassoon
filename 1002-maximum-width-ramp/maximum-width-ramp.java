class Solution {
    public int maxWidthRamp(int[] nums) {
        int n = nums.length;
        int[] rm = new int[n];

        rm[n-1] = nums[n-1];

        for (int i = n-2; i >= 0; i--) {
            rm[i] = Math.max(rm[i+1], nums[i]);
        }

        int left = 0, right = 0;
        int max = 0;
        while (right < n) {
            while (left < right && nums[left] > rm[right]) {
                left++;
            }
            max = Math.max(max, right-left);
            right++;
        }
        return max;
    }
}