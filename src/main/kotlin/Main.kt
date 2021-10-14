fun main(args: Array<String>) {
    val dzifs = SimpleAgent("Dzifa")
    println(dzifs.act())

    val env = FoodEnvironment(SimpleAgent("Charlie"), SimpleAgent("Dzifa"), SimpleAgent("Yaa"))
    env.step()
//    env.step()
    println(env.scores)

    val env1 = FoodEnvironment()
    for (i in 1..10) {
        env1.step()
        println(env1.animal)
    }
}