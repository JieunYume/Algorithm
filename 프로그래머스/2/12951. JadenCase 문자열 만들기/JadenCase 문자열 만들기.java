import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] words = s.split(" ");
        for(int i=0; i<words.length; i++){
            if(words[i].length() != 0){
                answer = answer + words[i].substring(0, 1).toUpperCase() 
                    + words[i].substring(1).toLowerCase() + " ";
            }else{
                answer += " ";
            }
        }
        
        if(s.substring(s.length()-1, s.length()).equals(" ")){
            return answer;
        }
        return answer.substring(0, answer.length()-1);
    }
}