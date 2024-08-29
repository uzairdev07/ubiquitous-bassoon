class Solution {
    private int[] _intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int n : nums1) {
            if (map.containsKey(n)) {
                map.put(n, map.get(n) + 1);
            } else
                map.put(n, 1);
        }
        List<Integer> result = new ArrayList<>();
        for (int n : nums2) {
            if (map.containsKey(n)) {
                if (map.get(n) <= 0)
                    continue;
                result.add(n);
                map.put(n, map.get(n) - 1);
            }
        }
        return result.stream().mapToInt(i->i).toArray();
    }
    public int[] intersect(int[] nums1, int[] nums2) {
        return  (nums1.length < nums2.length) ?
                _intersect(nums1, nums2) :
                _intersect(nums2, nums1);
    }
}