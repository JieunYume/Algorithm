import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        
        int n = A.length;
        for(int i=0; i<n; i++){
            answer += A[i]*B[n-i-1];
        }

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.

        return answer;
    }
}