class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int x = nums.length / 3;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        List<Integer> res = new ArrayList<>();

        for (int n : nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
            if (map.get(n) > x) {
                if (!res.contains(n))
                    res.add(n);
            }
        }
        return res;
    }
}