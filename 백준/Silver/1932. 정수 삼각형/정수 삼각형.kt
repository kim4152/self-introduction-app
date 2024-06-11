fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val input = br.readLine().toInt()
    val array = Array(input){IntArray(input){-1} }
    for(i in 0 until input){
        var index = 0
        val a = br.readLine().split(" ").map { it.toInt() }
        while (index <= i){
            array[i][index] = a[index]
            index++
        }
    }
    val dp = Array(input){IntArray(input){-1} }
    dp[0][0] = array[0][0]
    for (i in 0 until input-1){
        for (j in 0 until input){
            if (array[i][j] != -1){
                dp[i+1][j]=maxOf(array[i+1][j] + dp[i][j],dp[i+1][j])
                dp[i+1][j+1]=maxOf(array[i+1][j+1] + dp[i][j],dp[i+1][j+1])
            }else{
                break
            }
        }
    }
    val result = dp[input-1].max()
    bw.write("${result}")
    bw.flush()
    bw.close()
}

