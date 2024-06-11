class Solution {
    fun solution(s: String): IntArray {
    var answer: IntArray = intArrayOf(0,0)
    var sum = 0
    var time = 0
    var gap = 0
    var beforeStr = s
    var afterStr = ""
    while(beforeStr!="1"){
        afterStr = beforeStr.replace("0","")
        gap = beforeStr.length - afterStr.length
        sum += gap
        beforeStr = Integer.toBinaryString(afterStr.length)
        time++
    }
    answer[0] = time
    answer[1] = sum
    return answer
}
}