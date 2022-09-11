class Circle(name: String) : Shape(name) {
    private var r = 0

    fun setDimensions(radius: Int) {
        this.r = radius
    }

    override fun printDimensions() {
        println("Circle Dimensions: Radius:$r")
    }

    override fun getArea(): Double {
        return Math.PI * r * r
    }

}