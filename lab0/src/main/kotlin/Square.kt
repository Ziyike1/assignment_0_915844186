open class Square(name: String) : Shape(name) {
    private var l = 0
    private var h = 0

    fun setDimensions(l: Int, h: Int) {
        this.l = l
        this.h = h
    }

    override fun printDimensions() {
        println("Square Dimensions: Length: $l Height: $h")
    }

    override fun getArea(): Double {
        return (l * h).toDouble()
    }
}