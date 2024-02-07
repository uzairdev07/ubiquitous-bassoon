class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> data = new HashMap<>();
        
        char[] chars = s.toCharArray();
        
        for (char ch : chars)
            data.put(ch, data.getOrDefault(ch, 0) + 1);
        
        data = data.entrySet()
                  .stream()
                  .sorted((i1, i2)
                              -> i2.getValue().compareTo(
                                  i1.getValue()))
                  .collect(Collectors.toMap(
                      Map.Entry::getKey,
                      Map.Entry::getValue,
                      (e1, e2) -> e1, LinkedHashMap::new));
        
        String result = "";
        for (Character ch : data.keySet()) {
            for (int i = 0; i < data.get(ch); i++) {
                result += ch;
            }
        }
        
        return result;
        
    }
}