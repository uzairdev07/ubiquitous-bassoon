class Solution {
public:
    int deleteAndEarn(vector<int>& nums) {
//        sort(nums.begin(), nums.end());

        map<int, int> freq{};

        for(auto n: nums) 
            freq[n]++;

        set<int> s(nums.begin(), nums.end());

        vector<int> v (s.begin(), s.end());
        int a = 0, b = 0;
        int prev = -1;
        for(int i=0; i<v.size(); ++i) {
            int t = b;
            if(prev>0 && prev+1 == v[i])
                b = max((v[i] * freq[v[i]])+a, b);
            else
                b += v[i] * freq[v[i]];

            a = t;
            prev = v[i];
        }

        return b;
    }
};