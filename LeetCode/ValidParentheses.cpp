class Solution {
public:
    bool isOpeningParanthesis(char c){
        return (c == '(' || c == '{' || c == '[');
    }
    
    bool isValid(string parantheses) {
        if(parantheses.length() < 2) return false;
        
        stack<int> s;
        
        for(int i = 0; i<parantheses.length(); ++i){
            if(isOpeningParanthesis(parantheses[i])){
                s.push(parantheses[i]);
            }
            else{
                if(s.empty()) return false;
                int diff = parantheses[i] - s.top();
                 if(diff == 1 || diff == 2){
                    s.pop();
                }
                else{
                    return false;
                }
            }
        }
        return s.empty();
    }
};
