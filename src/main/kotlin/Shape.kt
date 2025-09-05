//abstract shape class
abstract class Shape (_name : String) : Dimensionable
{
    private var name = _name

    //return name function
    fun getName(): String{ return name }

    //initial getArea function, returns 0 if not overridden in child classes
    open fun getArea(): Double {
        return 0.0;
    }//end getArea
} //end shape class