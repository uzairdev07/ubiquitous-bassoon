class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int crr = 0;
        for (int x : nums) {
            if (x != 1) {
                max = Math.max(crr, max);
                crr = 0;
            } else {
                crr++;
            }
        }
        max = Math.max(crr, max);
        return max;
    }
}