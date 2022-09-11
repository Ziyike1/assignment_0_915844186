open class Shape(val name: String) : Dimensionable {

    open fun getArea(): Double {
        return 0.0
    }

    override fun printDimensions() {
        println("")
    }

}
