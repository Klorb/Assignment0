import kotlin.math.sqrt;

open class Triangle(_name: String): Shape(_name)
{
    private var side1: Double = 0.0;
    private var side2: Double = 0.0;
    private var side3: Double = 0.0;

    //set the dimensions of the shape
    fun setDimensions(newSide1: Double, newSide2: Double, newSide3: Double)
    {
        side1 = newSide1;
        side2 = newSide2;
        side3 = newSide3;
    }

    override fun printDimensions()
    {
        super.printDimensions()
        println("Triangle named ${getName()}\n" +
                "Side 1: ${side1}\n" +
                "Side 2: ${side2}\n" +
                "Side 3: ${side3}\n" +
                "Perimeter: ${getPerimeter()}\n" +
                "Area: ${this.getArea()}")
    }

    override fun getArea(): Double
    {
        val s: Double = .5*(side1+side2+side3);
        return sqrt(s*(s-side1)*(s-side2)*(s-side3));
    }

    open fun getPerimeter(): Double = side1+side2+side3;
}