class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        for (int i = 0; i < n; i++) {
            int l = 0, h = m - 1;

            while (l<=h) {
                int mid = (l+h)/2;

                if (matrix[i][mid] == target)
                    return true;
                if (matrix[i][mid] < target)
                    l = mid + 1;
                else 
                    h = mid - 1;
            }
        }
        return false;
    }
}