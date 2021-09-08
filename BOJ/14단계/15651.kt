//백트래킹 : 해를 찾는 도중 해가 아니어서 막히면, 되돌아가서 다시 해를 찾아가는 기법
//dfs를 이용해 모든 수열을 탐색하는데 이미 방문한 숫자가 나오는 경우 제외하기 때문에 백트래킹 기법
private val bw = System.out.bufferedWriter()
private val br = System.`in`.bufferedReader()

fun main(){
    val (n,m) = br.readLine().split(" ").map{it.toInt()}
    val arr = IntArray(m)

    dfs(m,repeat = n)

    bw.flush()
    bw.close()
    br.close()
}
private fun dfs(count: Int,prefix:String = "",repeat : Int){
    if(count == 0){
        bw.write("$prefix")
        bw.write("\n")
        return
    }
    for(i in 1..repeat){
        dfs(count-1,"$prefix$i ",repeat)
    }
}
