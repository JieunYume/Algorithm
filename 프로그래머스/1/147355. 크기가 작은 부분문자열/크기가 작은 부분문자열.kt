class Solution {
    fun solution(t: String, p: String): Int {
        val len = p.length
        var answer: Int = 0
        
        for(i in 0 until t.length-len+1){
            var num = t.substring(i, i+len)
            if(num <= p) answer++
        }
        
        return answer
    }
}