class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for (int i = m; i < nums1.length; i++)
            nums1[i] = nums2[j++];

        Arrays.sort(nums1);

    }

    public void sortArray(int arr[], int N) {
        for (int i = 0; i < N;) {
            if (arr[i] == i + 1) {
                i++;
            } else {
                int temp1 = arr[i];
                int temp2 = arr[arr[i] - 1];
                arr[i] = temp2;
                arr[temp1 - 1] = temp1;
            }
        }
    }

}