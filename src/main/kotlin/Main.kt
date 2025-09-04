fun main (args: Array<String>)
{
    var sqShape: Square = Square("Squngus");

    sqShape.setDimensions(5.0, 5.0);

    println("${sqShape.printDimensions()}");

    var tringle: Triangle = Triangle("trangie");

    tringle.setDimensions(5.0, 4.0, 3.0);

    println("${tringle.printDimensions()}");

    var cergle: Circle = Circle("chirchle");

    cergle.setDimensions(5.0);

    cergle.printDimensions();

    var equus: EquilateralTriangle = EquilateralTriangle("equineAngle");

    equus.setDimensions(5.0);

    equus.printDimensions();
}