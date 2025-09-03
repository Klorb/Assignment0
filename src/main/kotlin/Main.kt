fun main (args: Array<String>)
{
    var sqShape: Square = Square("Square");

    sqShape.setDimensions(5.0, 5.0);

    println("${sqShape.getName()} Area: ${sqShape.getArea()}");

}