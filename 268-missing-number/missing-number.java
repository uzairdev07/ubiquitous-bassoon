class Solution {
    public int missingNumber(int[] nums) {
        int[] freq = new int[10000];
        
        for (int i : nums)
            freq[i]++;

        System.out.println(Arrays.toString(freq));

        for (int i = 0; i < freq.length; i++)
            if (freq[i] == 0)
                return i;

        return nums.length;
    }
}