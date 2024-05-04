package example.myapp

interface FishAction {
    fun eat()
}

object GoldColor : FishColor {
    override val color = "gold"
}

interface FishColor {
    val color: String
}

class PrintingFishAction(val food: String) : FishAction {
    override fun eat() {
        println(food)
    }
}

abstract class AquariumFish : FishAction {
    abstract val color: String
    override fun eat() {
        println("yum")
    }
}

class Shark : AquariumFish() {
    override val color = "grey"
    override fun eat() {
        println("hunt and eat fish")
    }
}

class Plecostomus(fishColor: FishColor = GoldColor) : AquariumFish() {
    override val color = fishColor.color
    override fun eat() {
        println("eat algae")
    }
}
