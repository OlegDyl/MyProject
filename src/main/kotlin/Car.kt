import kotlin.random.Random

class Car {
    val brand = "Audi"
    val model = "A3"
    val color = "Red"

    fun move() {
        val distance = Random.nextInt(1, 10)
        println("Car passed $distance km")
    }
}