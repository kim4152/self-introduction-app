class Solution {
    fun solution(id_list: Array<String>, report: Array<String>, k: Int): IntArray {
    var answer: IntArray = IntArray(id_list.size){0}
    val resultMap = mutableMapOf<String,Int>()
    val mapSet = mutableMapOf<String,MutableSet<String>>()
    id_list.forEach { user ->
        resultMap[user] = 0
        mapSet[user] = mutableSetOf()
    }
    report.forEach {
        val(a,b) = it.split(" ")
        mapSet[b]?.add(a)
    }
    mapSet.forEach { t, u ->
        if (u.size>=k){
            u.forEach {
                resultMap[it] = resultMap[it]!! + 1
            }
        }
    }
    id_list.forEachIndexed { index, s ->
      answer[index] = resultMap[s]!!
    }
    return answer
}
}