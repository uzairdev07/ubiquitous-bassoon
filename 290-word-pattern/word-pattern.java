class Solution {
    public boolean wordPattern(String pattern, String s)  {

        String[] arr = s.split(" ");
        if (arr.length != pattern.length())
            return false;

        Map<Character, String> map = new HashMap<>();

        int i = 0;
        for (char ch : pattern.toCharArray()) {
            if (map.containsKey(ch)) {
                if (!map.get(ch).equals(arr[i])) {
                    return false;
                }
            } else {
                if (map.containsValue(arr[i])) {
                    return false;
                }

                map.put(ch, arr[i]);
            }
            i++;
        }

        return true;

    }
}