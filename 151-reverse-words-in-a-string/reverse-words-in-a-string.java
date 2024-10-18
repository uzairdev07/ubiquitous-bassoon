class Solution {
    public String reverseWords(String s) {
        String[] a = s.trim().split(" ");

        StringBuilder res = new StringBuilder();
        for(String e : a) {
            if (!e.equals(""))
                res.append(new StringBuilder(e).reverse().append(" ").toString());
        }
        return res.reverse().toString().trim(); 

    }
}