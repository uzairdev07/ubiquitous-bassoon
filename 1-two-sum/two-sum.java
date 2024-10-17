class Solution {
    public int[] twoSum(int[] nums, int t) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(t-nums[i])) {
                int j = map.get(t-nums[i]);
                return new int[]{
                    Math.min(i, j),
                    Math.max(i, j)
                };
            } else
                map.put(nums[i], i);
        }
        
        return new int[]{-1, -1};
    }
}