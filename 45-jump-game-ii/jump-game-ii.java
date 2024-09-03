class Solution {
    public int jump(int[] nums) {
        int tj = 0;
        int des = nums.length - 1;
        int cv = 0;
        int li = 0;

        if (nums.length == 1)
            return 0;

        for (int i = 0; i < nums.length; i++) {
            cv = Math.max(cv, nums[i] + i);

            if (i == li) {
                li = cv;
                tj++;

                if (cv >= des)
                    return tj;
            }
        }
        return tj;
    
    }
}