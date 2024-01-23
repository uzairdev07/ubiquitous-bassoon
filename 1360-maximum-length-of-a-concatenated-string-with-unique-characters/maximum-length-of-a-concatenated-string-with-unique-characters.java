class Solution {
    public int maxLength(List<String> arr) {
        List<String> result = new ArrayList<>();
        result.add("");
        for (String s : arr) {
            if (!isUnique(s)) continue;
            List<String> resultList = new ArrayList<>();
            for (String each : result) {
                String t = each + s;
                if (isUnique(t)) resultList.add(t);
            }
            result.addAll(resultList);
        }

        int ans = 0;
        for (String s : result)
            ans = Math.max(ans, s.length());
        return ans;
    }

    private boolean isUnique(String s) {
        if (s.length() > 26)
            return false;
        boolean[] isUsed = new boolean[26];
        for (char ch : s.toCharArray()) {
            if (isUsed[ch - 'a'])
                return false;
            isUsed[ch - 'a'] = true;
        }
        return true;
    }
}