class SimpleApplication {
 var name:String="Hello";

    fun print1():String{
        return name;
    }

}
fun main(args:Array<String>)
{
    var obj=SimpleApplication();
    print(obj);
    println(obj.print1());
    obj.name="Suresh";
    print(obj.print1())
    print(obj);
}