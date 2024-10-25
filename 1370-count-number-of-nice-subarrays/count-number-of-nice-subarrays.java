class Solution {
    private int atMostK(int[] nums, int k) {
        int oddCnt = 0;
        int l = 0, r = 0;
        int ans = 0;

        while (r < nums.length) {
            int x = nums[r];
        
            oddCnt += (x%2==1) ? 1 : 0;

            while (oddCnt > k) {
                oddCnt -= nums[l]%2;
                l++;
            }
            ans += r - l + 1;
            r++;
        }
        return ans;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return atMostK(nums, k) - atMostK(nums, k-1);
    }
}