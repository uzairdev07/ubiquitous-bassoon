class Solution {
    public boolean isAnagram(String s, String t) {
        return sort(s).equals(sort(t));
    }

    public String sort(String input) {
        String[] words = input.split("");
        Arrays.sort(words, String.CASE_INSENSITIVE_ORDER);
        return String.join(" ", words);
    }   

}