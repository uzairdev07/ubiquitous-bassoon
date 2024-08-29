class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            String temp = sortWord(s);
            List<String> value = map.getOrDefault(temp, new ArrayList<>());
            value.add(s);
            map.put(temp, value);
        }

        return map.values().stream().toList();

    }

    public String sortWord(String input) {
        String[] words = input.split("");
        Arrays.sort(words, String.CASE_INSENSITIVE_ORDER);
        return String.join(" ", words);
    }
}