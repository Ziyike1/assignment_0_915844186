import java.util.*
fun main(args: Array<String>) {
        val sq = Square("square")
        val ci = Circle("circle")
        val tr = Triangle("triangle")
        val etr = EquilateralTriangle("equilateralTriangle")

        val kb = Scanner(System.`in`)
        println("Enter length and height of Square: ")
        val l = kb.nextInt()
        val h = kb.nextInt()
        println("Enter the radius of Circle: ")
        val r = kb.nextInt()
        println("Enter 3 sides of Triangle: ")
        val a = kb.nextInt()
        val b = kb.nextInt()
        val c = kb.nextInt()
        println("Enter the side of Equilateral Triangle: ")
        val s = kb.nextInt()

        sq.setDimensions(l, h)
        sq.printDimensions()
        println("Area is: " + sq.getArea())

        ci.setDimensions(r)
        ci.printDimensions()
        println("Area is: " + ci.getArea())

        tr.setDimensions(a, b, c)
        tr.printDimensions()
        println("Area is: " + tr.getArea())

        etr.setDimensions(s)
        etr.printDimensions()
        println("Area is: " + etr.getArea())
}