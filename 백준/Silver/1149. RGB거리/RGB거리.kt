fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val input = br.readLine().toInt()

    val array = Array(input){ IntArray(3)}
    repeat(input){
        array[it] = br.readLine().split(" ").map { it.toInt() }.toIntArray()
    }

    val dp = array

    for (i in 1 until input){
        dp[i][0] = minOf(dp[i-1][1],dp[i-1][2]) + array[i][0]
        dp[i][1] = minOf(dp[i-1][0],dp[i-1][2]) + array[i][1]
        dp[i][2] = minOf(dp[i-1][1],dp[i-1][0]) + array[i][2]
    }
    val resutl = dp[input-1].min()

    bw.write("${resutl}")
    bw.flush()
    bw.close()
}

