abstract class Shape (_name : String) // : Dimensionable
{
    private var name = _name

    fun getName(): String{ return name }

    open fun getArea(): Double {
        return 0.0;
    }
}