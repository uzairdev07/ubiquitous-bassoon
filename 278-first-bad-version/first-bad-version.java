/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l = 0, r = n;
        int ans = n;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (isBadVersion(m)) {
                ans = m;
                r = m;
            } else 
                l = m + 1;
        }
        return ans;
    }
}