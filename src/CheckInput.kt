import java.lang.Exception

class CheckInput {

    private var name = ""
    private var value = 0.0
    private var words = ""

    constructor(name1: String,words1: String) {
        name = name1
        words = words1
        value = checkLetter()
        value = checkNegative()

    }

    private fun checkLetter(): Double {
        println(words)
        try {
            value = readLine()!!.toDouble()
        }catch (e: Exception) {
            System.out.println("$name you entered an invalid value\n")
            value = checkLetter()
        }
        return value
    }

    private fun checkNegative(): Double {
        if (value >= 0) {
            value = value
        }else {
            do {
                println("$name you entered a negative number\n")
                value = checkLetter()
            }while (value < 0)
        }

        return value
    }

    fun getResult(): Double = value
}