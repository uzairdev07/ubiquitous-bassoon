class Solution {
    public String reverseVowels(String s) {
        int a = 0, b = s.length() - 1;
        char[] arr = s.toCharArray();
        while (a < b) {
            if (isVowel(arr[b])) {
                if (!isVowel(arr[a])) {
                    a++;
                    continue;
                }
                // swap
                swap(arr, a, b);
                a++;
                b--;
            } else {
                if (!isVowel(arr[a]))
                    a++;
                b--;
            }
        }
        return new String(arr);
    }
        public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U';
    }
}