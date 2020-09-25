
class Input {

    private var name: String = "-1"
    var x = "\n"

    fun input() {
        if(name.equals("-1")) {
            println("Enter your name: ")
            name = readLine()!!
            x = ""
        }

        var value = CheckInput(name,"$x" + "Enter value: ").getResult()
        var percent = CheckInput(name,"Enter percent: ").getResult()
        PercentageCal(value,percent).getValue()
        contd()
    }

    fun contd() {
        println("\n$name you want to continue?\nEnter yes or no: ")
        var str = readLine()!!.trim().toLowerCase()

        when(str) {
            "no" -> println("\nGoodbye $name")
            "yes" -> {
                x = "\n"
                input()
            }
            else -> contd()
        }
    }
}