//begin main
fun main (args: Array<String>)
{
    //doing print for square
    var sqShape: Square = Square("Squngus");
    sqShape.setDimensions(5.0, 5.0);
    sqShape.printDimensions();

    //doing print for triangle
    var tringle: Triangle = Triangle("trangie");
    tringle.setDimensions(5.0, 4.0, 3.0);
    tringle.printDimensions();

    //doing print for circle
    var cergle: Circle = Circle("chirchle");
    cergle.setDimensions(5.0);
    cergle.printDimensions();

    //doing print for equilateral triangle
    var equus: EquilateralTriangle = EquilateralTriangle("equineAngle");
    equus.setDimensions(5.0);
    equus.printDimensions();
} //end main