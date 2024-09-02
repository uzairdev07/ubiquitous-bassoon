class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder rs = new StringBuilder();

        String[] arr = s.split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            if (!arr[i].equals("")) {
                rs.append(arr[i]).append(" ");
            }
        }
        return rs.toString().trim();
    }
}