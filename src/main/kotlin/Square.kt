//square class
class Square (_name: String): Shape(_name)
{
    //variables for
    var length: Double = 0.0;
    var height: Double = 0.0;

    //set the dimensions of the shape
    fun setDimensions(newLength: Double, newHeight: Double)
    {
        length = newLength;
        height = newHeight;
    }

    //basically this programs toString, prints Length, Height, Perimeter, and Area for a Square
    override fun printDimensions()
    {
        super.printDimensions();
        println("Square named ${getName()}\n" +
                "Length: ${length}\n" +
                "Height: ${height}\n" +
                "Perimiter: ${getPerimeter()}\n" +
                "Area: ${this.getArea()}\n");
    }//end printDimensions

    //getArea function specific for a square
    override fun getArea(): Double = length*height;

    //getPerimeter function
    fun getPerimeter(): Double = length*2 + height*2;
} //end square class