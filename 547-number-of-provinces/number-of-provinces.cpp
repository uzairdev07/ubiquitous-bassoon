class Solution {
public:

    int visited[200];
    void dfs(int s, vector<vector<int>>& isConnected, int crr) {
        int n = isConnected[0].size();
        
        for(int i=s; i<n; ++i) {
            if(isConnected[crr][i] && !visited[i]) {
                visited[i] = 1;
                dfs(s, isConnected, i);
            } 
        }
    }

    int findCircleNum(vector<vector<int>>& isConnected) {
        int comp = 0;
        for(int i=0; i<200; ++i) {
            visited[i] = 0;
        }
        
        for(int i=0; i<isConnected.size(); ++i) {

            if(visited[i])
                continue;
            
            visited[i] = 1;
            dfs(i+1, isConnected, i);

            ++comp;
        }

        return comp;
    }
};