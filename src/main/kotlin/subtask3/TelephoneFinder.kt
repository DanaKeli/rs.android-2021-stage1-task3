package subtask3

class TelephoneFinder {

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        if (number.isEmpty()) return null
        val number2 = number.trim()
        for (i in number2) {
            if (i !in '0'..'9') {
                return null
            }
        }
        val arrayList: ArrayList<String> = ArrayList<String>()

        for ((index, ch) in number2.withIndex()) {
            val arr: IntArray = getResult(ch - '0')

            val stringBuilder: StringBuilder = StringBuilder(number2)
            for (j in arr) {
                var x = '0' + j
                stringBuilder.setCharAt(index, '0' + j)
                var y = stringBuilder.toString()
                arrayList.add(stringBuilder.toString())
            }
        }
        return arrayList.toTypedArray()
    }

    private fun getResult(number: Int): IntArray {
        val array: IntArray
        when (number) {
            1 -> {
                array = intArrayOf(2, 4)
            }
            2 -> {
                array = intArrayOf(1, 3, 5)
            }
            3 -> {
                array = intArrayOf(2, 6)
            }
            4 -> {
                array = intArrayOf(1, 5, 7)
            }
            5 -> {
                array = intArrayOf(2, 4, 6, 8)
            }
            6 -> {
                array = intArrayOf(3, 5, 9)
            }
            7 -> {
                array = intArrayOf(4, 8)
            }
            8 -> {
                array = intArrayOf(5, 7, 9, 0)
            }
            9 -> {
                array = intArrayOf(6, 8)
            }
            else -> {
                array = intArrayOf(8)
            }
        }

        return array
    }
}

