class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        if (nums.length == 0) {
            return result;
        }

        Map<Integer, Integer> map = new HashMap<>();
        boolean isFound = false;

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && nums[i] == target) {
                result[0] = Math.min(map.get(nums[i]), i);
                result[1] = i;
                isFound = true;
            } else if (nums[i] == target) {
                map.put(nums[i], i);
            }
        }

        if (!isFound) {
            if (map.containsKey(target)) {
                result[0] = map.get(target);
                result[1] = map.get(target);
            }
        }

        return result;
    }
}