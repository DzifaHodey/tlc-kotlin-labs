class RandomAgent(override val name: String, prob : Double) : Actor {
    override fun act(): Action {
        return NoAction()
    }

    override fun perceive(vararg facts: Percept) {
        TODO("Not yet implemented")
    }
}