class Solution {
    public int search(int[] nums, int t) {
        int pivot = 0;
        int n = nums.length;

        if (n == 1)
            return (nums[0] == t ? 0 : -1);
        else if (n == 0)
            return -1;

        int prev = nums[0];
        int idx = 1;
        while (idx < n) {
            if (nums[idx] < prev) {
                pivot = idx;
                break;
            }
            
            prev = nums[idx];
            idx++;
        }

        int l = 0, r = pivot - 1;

        while (l<=r) {
            int mid = (l + r)/2;
            
            if (nums[mid] == t)
                return mid;
            
            if (nums[mid] < t)
                l = mid+1;
            else
                r = mid-1;
        }

        l = pivot;
        r = n-1;

        while (l<=r) {
            int mid = (l + r)/2;
            
            if (nums[mid] == t)
                return mid;
            
            if (nums[mid] < t)
                l = mid+1;
            else
                r = mid-1;
        }

        return -1;

    }
}