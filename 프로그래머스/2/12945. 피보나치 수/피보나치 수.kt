class Solution {
    fun solution(n: Int): Int {
    if (n == 0) return 0
    if (n == 1) return 1

    val MOD = 1234567
    var a = 0
    var b = 1
    var result = 0

    for (i in 2..n) {
        result = (a + b) % MOD
        a = b
        b = result
    }

    return result
}

}