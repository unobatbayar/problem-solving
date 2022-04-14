class Solution {
public:
    int maxArea(vector<int>& height) {
        int max = 0;
        
        int start = 0;
        int end = height.size() - 1;
        
        
        while(start != end)
	    {
            int w = min(height[start], height[end]);
            int l = end-start;
            int area = w*l;
            if(area > max) max = area;
            
            if(height[start] > height[end]){
                end--;
            }
            else{
                start++;
            }
            
            
	    }
        
        return max;
    }
};
