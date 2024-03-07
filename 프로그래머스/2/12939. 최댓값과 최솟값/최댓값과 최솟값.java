import java.lang.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        
        String[] numString = s.split("\\s");
        int[] numInt = new int[numString.length];
        for(int i=0; i<numInt.length; i++){
            numInt[i] = Integer.parseInt(numString[i]);
            if(max<numInt[i]) max = numInt[i];
            if(min>numInt[i]) min = numInt[i];
        }
        answer += min;
        answer += " ";
        answer += max;
        
        return answer;
    }
}