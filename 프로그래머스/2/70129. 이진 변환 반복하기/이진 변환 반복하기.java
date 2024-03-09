class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
        int zeroCount = 0;
        int changeCount = 0;
        int tmp;
    
        while(s.length() != 1){
            if(s.contains("0")){
                zeroCount += s.length() - s.replace("0", "").length();
                s = s.replace("0", "");
            }
            // System.out.println("zeroCount: "+zeroCount);

            tmp = s.length();
            s = "";
            while(tmp != 0){
                s += tmp%2;
                tmp = tmp/2;
            }
            StringBuffer sb = new StringBuffer(s);
            s = sb.reverse().toString();
            // System.out.println(s);
            changeCount++;
        }
        answer[0] = changeCount;
        answer[1] = zeroCount;
        return answer;
    }
}