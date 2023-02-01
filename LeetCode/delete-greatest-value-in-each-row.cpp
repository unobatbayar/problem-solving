class Solution {
public:
    int deleteGreatestValue(vector<vector<int>>& grid) {
        int total = 0;

        while(grid[0].size() > 0){
            int maximum = INT_MIN;
            int maximum_index = 0;

            // iterate
            for(int i = 0; i<grid.size(); ++i){
                int local_maxima = INT_MIN;
                int local_maxima_index = 0;

                // search
                for(int k = 0; k<grid[i].size(); ++k){
                    if(grid[i][k] > local_maxima){
                        local_maxima = grid[i][k];
                        local_maxima_index = k;
                    }
                }

                // remove
                grid[i].erase(grid[i].begin() + local_maxima_index); 

                // save
                if(local_maxima > maximum){
                    maximum = local_maxima;
                }
            }

            total += maximum;
        }

        return total;
    }
};
