class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        int minDiff = Integer.MAX_VALUE;

        Arrays.sort(arr);

        for (int i = 1; i < arr.length; i++) {
            int diff = Math.abs(arr[i] - arr[i-1]);
            minDiff = Math.min(diff, minDiff);
        }

        List<List<Integer>> pairs = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {
            List<Integer> pair = new ArrayList<>();
            if (Math.abs(arr[i] - arr[i-1]) == minDiff) {
                pair.add(arr[i-1]);
                pair.add(arr[i]);
                pairs.add(pair);
            }
        }

        return pairs;

    }

}