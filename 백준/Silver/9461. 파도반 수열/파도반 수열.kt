fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val input = br.readLine().toInt()
    repeat(input) {
        bw.write("${solve(br.readLine().toInt())}\n")
    }

    bw.flush()
    bw.close()
}
fun solve(a:Int):Long{
    val array = LongArray(101){0L}
    for(i in 1 .. 3){
        array[i] = 1
    }
    for (i in 4..a) {
        array[i] = array[i-2] + array[i-3]
    }
    return array[a]
}
