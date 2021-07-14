package subtask1

class Combinator {


    fun checkChooseFromArray(array: Array<Int>): Int? {

        val p = array[0]
        val c = array[1]

        if (array.size != 2) return null
        if (array[0] <= array[1]) return 1
        if (array[0] < 0 || array[1] <= 0) return null

        for (x in 2 until c) {
            if (combinations(x, c) == p) {
                return x
            }
        }
        return null

    }

    private fun combinations(x: Int, c: Int): Int {
        var a: Long = 1
        for (i in (c - x +1)..c) {
            a *= i
        }

        var b: Long = 1
        for (i in 2..x) {
            b *= i
        }
        return if (a % b == 0L) {
            (a/b).toInt()
        } else {
            0
        }
    }
}
