class Solution {
public:
    bool isAnagram(string s, string t) {
        int cn1[26], cn2[26];

        int n = s.length(), m= t.length();
        if(n != m)
            return false;

        for(int i=0; i<n; ++i) {
                ++cn1[s[i]-'a'], ++cn2[t[i]-'a'];
        }

        for(int i=0; i<26; ++i)
            if(cn1[i] != cn2[i])
                return false;

        return true;
    }
};
