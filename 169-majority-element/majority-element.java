class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        int max = 0;
        int ans = 0;
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0)+1);
            if (freq.get(n) > max) {
                max = freq.get(n);
                ans = n;
            }
        }
        return ans;
        
    }
}