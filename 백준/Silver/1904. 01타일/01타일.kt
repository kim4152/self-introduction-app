fun main() {
    val br = System.`in`.bufferedReader()
    val bw = System.out.bufferedWriter()
    val input = br.readLine().toInt()
    br.close()
    bw.write("${solve(input)}")

    bw.flush()
    bw.close()
}
fun solve(a:Int):Int{
    if (a == 1) return 1
    if (a == 2) return 2
    var x = 1
    var y = 2
    var tmp =0
    for (i in 3..a) {
        tmp = (x+y) % 15746
        x = y
        y = tmp
    }
    return y 
}


