import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        boolean flag = false;
        Stack<String> stackString = new Stack<>();
        
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                stackString.push("(");
            } else if(s.charAt(i) == ')'){
                if(stackString.size() == 0){
                    answer = false;
                    return answer;
                }
                stackString.pop();
            }
        }
        if(stackString.size() != 0){
            answer = false;
        }

        return answer;
    }
}