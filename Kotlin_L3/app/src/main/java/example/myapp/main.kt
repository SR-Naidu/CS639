package example.myapp

import kotlin.math.PI

open class Aquarium(open var length: Int = 100, open var width: Int = 20, open var height: Int = 40) {
    open var volume: Int
        get() = (length * width * height / 1000 * PI).toInt()
        set(value) {
            height = ((value * 1000 / PI) / (length * width)).toInt()
        }

    open fun printSize() {
        println("Width: $width cm, Length: $length cm, Height: $height cm")
        println("Volume: $volume liters")
    }
}

class TowerTank(override var height: Int, var diameter: Int) : Aquarium(height = height, width = diameter, length = diameter) {
    override var volume: Int
        get() = (width / 2 * width / 2 * height / 1000 * PI).toInt()
        set(value) {
            height = ((value * 1000 / PI) / (width / 2 * width / 2)).toInt()
        }

    override fun printSize() {
        println("Shape: cylinder")
        super.printSize()
    }
}

fun makeFish() {
    val shark = Shark()
    val pleco = Plecostomus()
    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}

fun main() {
    makeFish()
    buildAquarium()
}

fun buildAquarium() {
    val myAquarium = Aquarium(width = 25, length = 25, height = 40)
    myAquarium.printSize()
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSize()
}
