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
    val dp = IntArray(arr.size)
    dp[0] = arr[0]
    var maxSum = dp[0]

    for (i in 1 until arr.size) {
        dp[i] = maxOf(dp[i - 1] + arr[i], arr[i])
        if (dp[i] > maxSum) {
            maxSum = dp[i]
        }
    }

    return maxSum
}
