class Solution {
    public int majorityElement(int[] nums) {
        int x = nums.length / 2;
        
        Map<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
            if (map.get(n) > x) {
                if (max < map.get(n))
                    max = n;
            }
        }
        return max;
    }
}