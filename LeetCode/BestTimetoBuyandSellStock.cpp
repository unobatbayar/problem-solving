class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int min = 0;
        int max = 0;
        int maximum_profit = 0;
        
        for(int i = 1; i<prices.size(); ++i){
            if(prices[i] < prices[min]){
                min = i;
                max = i;
            }
            else if(prices[i] > prices[max]){
                max = i;
                int profit = prices[max] - prices[min];
                if(profit > maximum_profit) maximum_profit = profit;
            }
        }
        
        return maximum_profit;
    }
};
