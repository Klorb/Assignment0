//import: sqrt for area function
import kotlin.math.sqrt

//equilateral triangle class
class EquilateralTriangle(_name: String): Triangle(_name)
{
    //one variable for all side lengths
    var sideLen: Double = 0.0;

    //set dimensions of shape
    fun setDimensions(newLen: Double)
    {
        sideLen = newLen;
    }//end setDimensions

    //prints dimensions
    override fun printDimensions()
    {
        println("Printing dimensions for: Equilateral Triangle named ${getName()}\n" +
                "Side 1: ${sideLen}\n" +
                "Side 2: ${sideLen}\n" +
                "Side 3: ${sideLen}\n" +
                "Perimeter: ${getPerimeter()}\n" +
                "Area: ${this.getArea()}\n")
    }//end printDimensions

    //gets area of equilateral triangle
    override fun getArea(): Double
    {
        val s: Double = .5*(sideLen*3);
        return sqrt(s*(s-sideLen)*(s-sideLen)*(s-sideLen));
    }//end getArea

    //gets perimeter of equilateral triangle
    override fun getPerimeter(): Double = sideLen*3;
}//end equilateral triangle class