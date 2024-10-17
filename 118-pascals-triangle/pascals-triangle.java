class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        res.add(List.of(1));

        for (int i = 1; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(1);

            List<Integer> newList = res.get(i-1);
            int l = 0, r = 1;
            while (l < r && r < newList.size()) {
                int result = newList.get(l) + newList.get(r);
                temp.add(result);
                l++;
                if (r+1 < newList.size())
                    r++;
            }

            temp.add(1);
            res.add(temp);
        }

        return res;

    }
}