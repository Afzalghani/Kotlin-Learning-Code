package OOPS
open class InheritanceCheck {
    open fun think():String{
        return "Afzal";
    }

}
class B: InheritanceCheck(){

    override fun think():String{
        return "Ghani";
    }

}

class Animal  (val _name:String,val _No_Of_legs: Int)
{
    var name:String;
    var No_Of_legs: Int;
    //Primary Constructor which is used to initlize the object
    //Secondary Constructor is used to add some logic in the code
    init{
        this.name=_name
        this.No_Of_legs=_No_Of_legs
    }
}
fun main(args: Array<String>)
{
   var b= B();
    print(b.think());
}