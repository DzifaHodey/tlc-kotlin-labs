var funds : Double = 100.0
val pswd = "password"

fun main() {
    var input : String
    var cmd : List<String>

    while (true) {
        print("Command: ")
        input = readLine()!!
        cmd = input.split(" ")
        when (cmd[0]) {
            "balance"-> balance()
            "deposit" -> if (cmd.getOrNull(1) != null && cmd[1].toDoubleOrNull()!=null ) deposit(cmd[1].toDouble())
                        else println("invalid amount")
            "withdraw" -> if (cmd.getOrNull(1) != null && cmd[1].toDoubleOrNull()!=null) withdraw(cmd[1].toDouble())
                        else println("invalid amount")
            "exit" -> break
            else -> println("Invalid command")
        }

    }
}

fun balance() : Unit = println(funds)


fun deposit(amount : Double) {
    funds += amount
    println("Amount deposited successfully")
}

fun withdraw(amount: Double){
    print("Input password: ")
    val pswdInput = readLine()!!
    if (pswdInput == pswd) {
        if (amount < funds) {
            funds -= amount
            println("Funds withdrawn successfully")
        }
        else println("Insufficient funds")
    }
    else println("Incorrect password")

}