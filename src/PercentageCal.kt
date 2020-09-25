class PercentageCal {

    private var percent : Double = 0.0
    private var value : Double = 0.0
    private var result : Double = 0.0

    constructor(value1 : Double,percent1 : Double) {
        percent = percent1
        value = value1
        result = calPercentage()
    }

    private fun calPercentage(): Double = value * (percent/100)

    fun getValue() = println("The result is $result")
}