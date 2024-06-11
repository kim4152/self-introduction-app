fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val input = br.readLine().toInt()

    val arr = br.readLine().split(" ").map { it.toInt() }.toIntArray()

    bw.write(maxSubarraySum(arr).toString())
    bw.flush()
    bw.close()
}
fun maxSubarraySum(arr: IntArray): Int {
    val tmpArray = arr
    var max = tmpArray[0]
    tmpArray[0] = arr[0]
    
    for (i in 1 until arr.size){
        tmpArray[i] = maxOf(tmpArray[i-1] + arr[i], arr[i])
        if (tmpArray[i]>max){
            max = tmpArray[i]
        }
    }
    
    return max
}
