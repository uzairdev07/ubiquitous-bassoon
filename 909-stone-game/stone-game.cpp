class Solution {
public:
    bool stoneGame(vector<int>& piles) {
        int i=0, j = piles.size(), n = j;

        int l = (n/2)-1, r=l+1;
        long long a =0, b=0;
        for(;l>=0;) {
            if(piles[l] > piles[r]) {
                a += piles[l];
                b += piles[r];
            } else {
                a += piles[r];
                b += piles[l];
            }
            ++r, --l;
        }
        return a > b;
    }
};