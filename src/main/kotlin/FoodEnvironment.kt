import kotlin.random.Random

class FoodEnvironment(vararg ags : Actor) : Environment(*ags) {
    val scores : MutableMap<Actor, Int> = mutableMapOf()
    var animal : String? = null

    init {
        for (agent in ags) scores[agent] = 0
    }
    override fun processAction(agent: Actor, act: Action) {
        if (act is ForageAction) scores[agent] = scores[agent]?.plus(1) ?:0
    }

    override fun sense(agent: Actor) {
        if (animal == null) agent.perceive()
        else agent.perceive(Percept("animal", animal!!))
    }

    override fun step() {
        var randomNum : Double = Random.nextDouble()
//        println(randomNum)
        animal = if (randomNum > 0.50) "bush meat"
        else null
        super.step()
    }
}