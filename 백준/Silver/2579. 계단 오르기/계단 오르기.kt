fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val input = br.readLine().toInt()
    val arr = IntArray(input + 1)
    val dp = IntArray(input + 1)
    for (i in 1..input) {
        arr[i] = br.readLine().toInt()
    }

    // 기본 초기화
    dp[1] = arr[1]
    if (input > 1) dp[2] = arr[1] + arr[2]
    if (input > 2) dp[3] = maxOf(arr[1] + arr[3], arr[2] + arr[3])

    if (input >= 4) {
        for (i in 4..input) {
            dp[i] = maxOf(dp[i - 2] + arr[i], dp[i - 3] + arr[i - 1] + arr[i])
        }
    }
    bw.write("${dp[input]}")
    bw.flush()
    bw.close()
}
