import kotlin.math.sqrt

class EquilateralTriangle(_name: String): Triangle(_name)
{
    var sideLen: Double = 0.0;

    fun setDimensions(newLen: Double)
    {
        sideLen = newLen;
    }

    override fun printDimensions()
    {
        println("Printing dimensions for: Equilateral Triangle named ${getName()}\n" +
                "Side 1: ${sideLen}\n" +
                "Side 2: ${sideLen}\n" +
                "Side 3: ${sideLen}\n" +
                "Perimeter: ${getPerimeter()}\n" +
                "Area: ${this.getArea()}\n")
    }

    override fun getArea(): Double
    {
        val s: Double = .5*(sideLen*3);
        return sqrt(s*(s-sideLen)*(s-sideLen)*(s-sideLen));
    }

    override fun getPerimeter(): Double = sideLen*3;
}