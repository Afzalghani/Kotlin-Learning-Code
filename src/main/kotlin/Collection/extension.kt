package Collection

//POJO class in Kotlin
data class Book(val name:String, val pages:Int, val author:String)
{

}
class GFG {
     companion object{
        fun getMetaData() : String {
            return "Static Method of Class"
        }
    }
}
fun getName():String{
        return "hello"
    }


fun String.getAllWords():List<String>{
    return this.split(" ");
}
fun main(args:Array<String>){
    var a:String ="How can I help you?"
println(GFG.getMetaData())
    var b=Book("Who will cry when You die",240,"Robin Sharma");
    println(b.toString());
    println(b.name);
var x= setOf("132",323);

    var y= listOf(123,"Afzal",'a',true,1.23)
    println(x)
    println(y)

}