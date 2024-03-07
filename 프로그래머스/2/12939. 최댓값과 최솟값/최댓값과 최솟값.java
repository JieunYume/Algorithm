import java.lang.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] numString = s.split("\\s");
        int[] numInt = new int[numString.length];
        int max, min;
        max = min = Integer.parseInt(numString[0]);
        
        for(int i=0; i<numInt.length; i++){
            numInt[i] = Integer.parseInt(numString[i]);
            if(max<numInt[i]) max = numInt[i];
            if(min>numInt[i]) min = numInt[i];
        }
        answer = min + " " + max;
        
        return answer;
    }
}