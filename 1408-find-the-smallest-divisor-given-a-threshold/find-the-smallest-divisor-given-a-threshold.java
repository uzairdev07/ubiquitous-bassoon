class Solution {
    static int sum(int[] arr, int div){
        int s = 0;
        for (int n : arr)
            s += Math.ceil(n*1.0/div*1.0);
        return s;
    }

    public static int smallestDivisor(int[] nums, int threshold) {
        Arrays.sort(nums);
        int low = 1; 
        int high = nums[nums.length-1];
        while(low<= high){
            int mid = (int)Math.floor((low+high)/2);
            if(sum(nums,mid)<= threshold){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return low;
    }
}