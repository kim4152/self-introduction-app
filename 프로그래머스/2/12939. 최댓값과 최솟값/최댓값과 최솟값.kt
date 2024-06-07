class Solution {
    fun solution(s: String): String {
    val array = s.split(" ").map { it.toInt() }.sorted()

    return "${array[0]} ${array.last()}"
}
}