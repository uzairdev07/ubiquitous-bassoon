class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> data = new HashMap<>();
        int ans = 0;
        int x = nums.length / 2;
        for (int n : nums) {
            data.put(n, data.getOrDefault(n ,0) + 1);
            if (data.get(n) > x)
                ans = n;
        }
        return ans;

    }
}