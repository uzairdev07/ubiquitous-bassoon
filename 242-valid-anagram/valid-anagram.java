class Solution {
    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> map = new HashMap<>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : t.toCharArray()) {
            if (!map.containsKey(ch)) {
                return false;
            } else {
                int v = map.get(ch);
                if (v > 1)
                    map.put(ch, v - 1);
                else 
                    map.remove(ch);
                }
        }
        
        return map.isEmpty();

    }

}