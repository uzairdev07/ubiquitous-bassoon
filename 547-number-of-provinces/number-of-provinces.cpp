class Solution {
public:

    int visited[200];
    void dfs(vector<vector<int>>& isConnected, int crr) {
        int n = isConnected[0].size();
        
        for(int i=0; i<n; ++i) {
            if(isConnected[crr][i] && !visited[i]) {
                visited[i] = 1;
                dfs( isConnected, i);
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
            dfs(isConnected, i);

            ++comp;
        }

        return comp;
    }
};