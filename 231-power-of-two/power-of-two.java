class Solution {
    Set<Long> pow = new HashSet<>();
    public boolean isPowerOfTwo(int n) {
        for (int i = -31; i < 32; i++)
            if (n == Math.pow(2, i))
                return true;
        return false;
    }
}