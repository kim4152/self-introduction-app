class Solution {
    fun solution(arr: IntArray): Int {
    var maxInt = 1
    arr.forEach {
        maxInt *= it
    }
    val minArr = arr
    for (i in (0 .. arr.size-1)){
        maxInt = max(arr[i], maxInt)
    }
    println(maxInt)
    for(i in (0 .. arr.size-2)){
        minArr[i+1] = min(minArr[i], minArr[i+1])
    }

    return minArr.last()
}
fun min(x:Int, y:Int):Int{
    return x*y/ max(x,y)
}

fun max(x:Int, y:Int):Int{
    var a =x
    var b = y
    var tmp = 0
    while(a!=0){
        tmp = a
        a = b % a
        b = tmp
    }
    return b
}
    
}