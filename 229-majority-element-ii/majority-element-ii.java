class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int k = nums.length/3;
        Map<Integer, Integer> freq = new HashMap<>();
        for (int x : nums)
            freq.put(x, freq.getOrDefault(x, 0) + 1);

        List<Integer> res = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            if (entry.getValue() > k)
                res.add(entry.getKey());
        }
        return res;
    }
}