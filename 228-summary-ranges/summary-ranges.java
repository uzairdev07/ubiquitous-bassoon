class Solution {
    public List<String> summaryRanges(int[] nums) {

        int n = nums.length;

        List<String> res = new ArrayList<>();

        if (n == 0) {
            return res;
        }

        if (n == 1) {
            res.add(String.valueOf(nums[0]));
            return res;
        }
        
        int prev = nums[0];
        int start = prev;
        for (int i = 1; i < n; i++) {
            if (nums[i] == prev+1) {
                prev = nums[i];
            } else {
                String r = String.valueOf(start);
                if (start != prev)
                    r += "->" + prev;
                res.add(r);
                prev = start = nums[i];
            }
        }
        String r = String.valueOf(start);
        if (start != prev)
            r += "->" + prev;
            res.add(r);

        return res;

    }
}