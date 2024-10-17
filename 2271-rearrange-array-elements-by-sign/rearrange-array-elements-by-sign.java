class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length/2;
        int[] pos = new int[n];
        int[] neg = new int[n];

        int pi = 0, ni = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
                pos[pi++] = nums[i];
            else if (nums[i] < 0)
                neg[ni++] = nums[i];
        }

        pi = ni = 0;
        boolean flag = true;
        for (int i = 0; i < nums.length; i++) {
            if (flag)
                nums[i] = pos[pi++];
            else
                nums[i] = neg[ni++];

            flag = !flag;
        }
        return nums;
    }
}