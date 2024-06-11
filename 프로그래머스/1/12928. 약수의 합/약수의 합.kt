class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        val end = Math.sqrt(n.toDouble())
        for (i in 1 .. end.toInt()){
            if(n % i == 0){
                if(i.toDouble() == end){
                    answer += i
                }else{
                    answer += i
                    answer += n/i
                }    
                
            }
            
        }
        return answer
    }
}