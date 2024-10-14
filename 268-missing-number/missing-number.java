class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = (n * (n + 1))/2;

        int cSum = 0;
        for (int x : nums)
            cSum += x;
        return sum - cSum;
    }

}