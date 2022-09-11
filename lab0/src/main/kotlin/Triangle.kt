import kotlin.math.sqrt
open class Triangle(name: String) : Shape(name) {
    private var a = 0
    private var b = 0
    private var c = 0

    fun setDimensions(side_a: Int, side_b: Int, side_c: Int) {
        this.a = side_a
        this.b = side_b
        this.c = side_c
    }

    override fun printDimensions() {
        println("Triangle Dimensions: Side 1: $a Side 2: $b Side 3: $c")
    }

    override fun getArea(): Double {
        val x = ((a + b + c) / 2).toDouble()
        return sqrt(x * (x - a) * (x - b) * (x - c))
    }
}