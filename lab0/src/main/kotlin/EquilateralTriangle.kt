import kotlin.math.sqrt
open class EquilateralTriangle(name: String) : Triangle(name) {
    private var sd = 0
    fun setDimensions(s: Int) {
        this.sd = s
    }

    override fun printDimensions() {
        println("Equilateral Triangle Dimensions: Side: $sd")
    }

    override fun getArea(): Double {
        val x = (3 * sd / 2).toDouble()
        return sqrt(x * (x - sd) * (x - sd) * (x - sd))
    }
}