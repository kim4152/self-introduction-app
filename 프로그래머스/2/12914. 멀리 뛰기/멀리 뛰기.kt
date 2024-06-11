class Solution {
    fun solution(n: Int): Long {
    if (n == 1) return 1
    if (n == 2) return 2

    val mod = 1234567
    var a = 1L
    var b = 2L

    for (i in 3..n) {
        val c = (a + b) % mod
        a = b
        b = c
    }

    return b
}

fun main() {
    println(solution(4))  // 출력: 5
    println(solution(5))  // 출력: 8
}

}