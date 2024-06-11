class Solution {
    fun solution(brown: Int, yellow: Int): IntArray {
        var answer = intArrayOf(0,0)
        val area = brown + yellow
        var width =0
        var height =0
        (3 .. area-3).forEach{
            if(area%it==0){
                height = it
                width = area / it
                
                if((height-2)*(width-2) == yellow){
                    answer[0] = width
                    answer[1] = height
                    return answer
                }
                
            }
        }
        return answer
    }
}