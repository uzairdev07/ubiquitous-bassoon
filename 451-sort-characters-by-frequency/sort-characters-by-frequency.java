class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for (char c : s.toCharArray())
            freq.put(c, freq.getOrDefault(c, 0)+1);

        List<Map.Entry<Character, Integer>> sorted = 
            new ArrayList<>(freq.entrySet());

        Collections.sort(sorted, (o1, o2) -> o2.getValue().compareTo(o1.getValue()));

        String res = "";
        for (Map.Entry<Character, Integer> each : sorted)
            res += String.valueOf(each.getKey()).repeat(each.getValue());
        return res;
    }
}