class Solution {
    lateinit var array : Array<MutableList<Int>>
lateinit var inN : IntArray
lateinit var outN : IntArray
lateinit var isVisited :BooleanArray
lateinit var isStackVisited : BooleanArray
fun solution(edges: Array<IntArray>): IntArray {
    var answer: IntArray = intArrayOf(0,0,0,0)
    inN = IntArray(1000001){0}
    outN = IntArray(1000001){0}
    array = Array(1000001){ mutableListOf()}
    isVisited= BooleanArray(1000001){false}
    isStackVisited= BooleanArray(1000001){false}

    edges.forEach { (start,end)->
        array[start].add(end)
        inN[end] ++
        outN[start] ++
    }
    array.forEachIndexed { index,it->
        if (it.size>=2 && inN[index] == 0){
            answer[0] = index
            return@forEachIndexed
        }
    }

    array[answer[0]].forEach{
        if (isStack(it)){
            answer[2] ++
        }else if(isEight(it)){
            answer[3]++
        }
        answer[1] = array[answer[0]].size - answer[2] - answer[3]
    }
    return answer
}
fun isStack(num:Int):Boolean{
    if (isStackVisited[num] == true) return false
    isStackVisited[num] = true
    if (array[num].size==0){
        return true
    }else{
        if(isStack(array[num][0])){
            return true
        }else{
            return false
        }
    }
}

fun isEight(num:Int):Boolean{
    if (inN[num]>=2 && outN[num] >=2){
        return true
    }else{
        array[num].forEach { outs->
            if (!isVisited[outs]){
                isVisited[outs] = true
                if(isEight(outs)){
                    return true
                }
            }
        }
        return false
    }
}
}