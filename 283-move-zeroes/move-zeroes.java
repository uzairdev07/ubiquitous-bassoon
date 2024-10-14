class Solution {
    public void moveZeroes(int[] nums) {
        int c = 0;
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (x == 0)
                cnt++;
            else
                nums[c++] = nums[i];
        }
        c = 0;
        for (int i = nums.length - 1; i >= 0 && c != cnt; i--) {
            nums[i] = 0;
            c++;
        }
    }
}