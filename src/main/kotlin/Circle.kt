import kotlin.math.PI

class Circle(_name: String): Shape(_name)
{
    private var radius = 0.0;

    //set the dimensions of the shape
    fun setDimensions(newRadius: Double)
    {
        radius = newRadius;
    }

    //basically this programs toString, prints Radius, Diameter, Perimeter, and area for a Circle
    override fun printDimensions()
    {
        super.printDimensions()

        println("Circle named ${getName()}\n" +
                "Radius: ${radius}\n" +
                "Diameter: ${getDiameter()}\n" +
                "Perimeter: ${getPerimeter()}\n" +
                "Area: ${getArea()}")
    }

    override fun getArea(): Double = PI * radius * radius;

    fun getPerimeter(): Double = 2 * PI * radius;

    fun getDiameter(): Double = 2 * radius;

}