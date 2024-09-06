class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (var each : map.entrySet()) {
            if (each.getValue() == 1)
                return each.getKey();
        }

        return -1;


    }
}