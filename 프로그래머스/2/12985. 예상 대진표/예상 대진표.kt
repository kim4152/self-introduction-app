import kotlin.math.*
class Solution {
    fun solution(n: Int, a: Int, b: Int): Int {
    if((a>n/2 && b>n/2) || ((a<=n/2)&&b<=n/2)){
        val result =solution(n/2,(a-1) % (n/2) +1,(b-1) % (n/2) +1)
        if(result>0){
            return result
        }
    }else{
        //결승에서 만남
        return log2(n.toDouble()).toInt()
    }
    return 0
}
}