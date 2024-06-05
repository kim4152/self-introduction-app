class Solution {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
    var start = intArrayOf(0, 0)

    // 시작 지점('S') 찾기
    run loop@{
        park.forEachIndexed { x, row ->
            row.forEachIndexed { y, c ->
                if (c == 'S') {
                    start[0] = x
                    start[1] = y
                    return@loop
                }
            }
        }
    }
    println("start = ${start.joinToString()}")

    // 경로를 따르기
    routes.forEach { route ->
        val direction = route[0]
        val distance = route[2].digitToInt()
        var move = 1

        when(direction) {
            'E' -> {
                while (move <= distance) {
                    if (start[1] + move >= park[0].length || park[start[0]][start[1] + move] == 'X') {
                        break
                    } else {
                        move++
                    }
                }
                if (move - 1 == distance) start[1] += move - 1
            }

            'W' -> {
                while (move <= distance) {
                    if (start[1] - move < 0 || park[start[0]][start[1] - move] == 'X') {
                        break
                    } else {
                        move++
                    }
                }
                if (move - 1 == distance) start[1] -= move - 1
            }

            'S' -> {
                while (move <= distance) {
                    if (start[0] + move >= park.size || park[start[0] + move][start[1]] == 'X') {
                        break
                    } else {
                        move++
                    }
                }
                if (move - 1 == distance) start[0] += move - 1
            }

            'N' -> {
                while (move <= distance) {
                    if (start[0] - move < 0 || park[start[0] - move][start[1]] == 'X') {
                        break
                    } else {
                        move++
                    }
                }
                if (move - 1 == distance) start[0] -= move - 1
            }
        }
    }

    println(start.joinToString())
    return start
}

}