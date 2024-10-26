class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftSum = 0, maxSum = 0;
        int n = cardPoints.length;
        for (int i = 0; i < k; i++)
            leftSum += cardPoints[i];

        maxSum = leftSum;
        int rightSum = 0;
        int idx = n-1;
        for (int i = k-1; i >= 0; i--) {
            leftSum -= cardPoints[i];
            rightSum += cardPoints[idx--];
            maxSum = Math.max(maxSum, leftSum+rightSum);
        }
        return maxSum;
    }
}