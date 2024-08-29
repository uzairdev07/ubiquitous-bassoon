class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int a : nums1) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        
        Set<Integer> res = new HashSet<>();
        for (int b : nums2) {
            if (map.containsKey(b)) {
                res.add(b);
            }
        }

        return res.stream().mapToInt(i -> i).toArray();

    }
}