package OOPS

import java.io.ObjectInputStream.GetField

class Bike(
    var name: String="hello",



    var No_Of_Vechles:Int=4
)
{
    var address:String="sure"
        get() = field;
        set(value) {
            field=value;
        }
    fun P(){
        println("The name of Bike is $name and Number of vechles is $No_Of_Vechles ");
    }

}
open class A{

    open fun Count( a:Int):Int{
        return a;
    }

}
class x:A(){
    override fun Count(a: Int): Int {
        return a;
    }

}

fun main(args: Array<String>)
{
  var c=x();
    println(c.Count(2));
    var m=Bike("honda",2);
}