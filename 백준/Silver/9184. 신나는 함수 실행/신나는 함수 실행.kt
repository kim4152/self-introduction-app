val memo = Array(21) { Array(21) { IntArray(21) { -1 } } }

fun w(a: Int, b: Int, c: Int): Int {
    if (a <= 0 || b <= 0 || c <= 0) {
        return 1
    }
    if (a > 20 || b > 20 || c > 20) {
        return w(20, 20, 20)
    }
    if (memo[a][b][c] != -1) {
        return memo[a][b][c]
    }
    if (a < b && b < c) {
        memo[a][b][c] = w(a, b, c - 1) + w(a, b - 1, c - 1) - w(a, b - 1, c)
    } else {
        memo[a][b][c] = w(a - 1, b, c) + w(a - 1, b - 1, c) + w(a - 1, b, c - 1) - w(a - 1, b - 1, c - 1)
    }
    return memo[a][b][c]
}

fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    
    while (true) {
        val (a, b, c) = br.readLine().split(" ").map { it.toInt() }
        if (a == -1 && b == -1 && c == -1) break
        bw.write("w($a, $b, $c) = ${w(a, b, c)}\n")
    }
    
    bw.flush()
    bw.close()
    br.close()
}
