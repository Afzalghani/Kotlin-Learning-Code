

fun main(args:Array<String>)
{
//    var i:Int=10;
//    while(i>0)
//    {
//        println("The value is $i");
//        i--;
//    }
//
//    var alarm=7;
//// Very Similar to switch statement in Kotlin
//    val text=when(alarm)
//    {
//        in 1..10 ->{
//            println("This is running on the first loop")
//            "this is first value $alarm"
//        }
//        7 ,8, 9, 10->{
//            println("This is running on the second loop")
//            "this is second value $alarm"
//        }
//        else->{
//            println("This is running on the third loop")
//            "this is alarm"
//        }
//    }
//    println(text);
//
//    println(getMax(12,32,43));
//
//    sendMessage(message ="What can  I help you", name="Hello")
//
//    print(compare("Afzal","Afzal"));
}

fun sendMessage(name:String="User", message: String="How are you"){
    println("The name of the person is $name and the message he send is $message");
}

fun compare(a:String, b: String):String
{
    if(a.equals(b))
        return "Both String are same";
    return "Both String are different";
}

fun getMax( a: Int,  b: Int): Int{
    if(a>b)
        return a;
    return b;
}
fun getMax(a: Double, b: Double):Double{
    if(a>b)
        return a;
    return b;
}

fun getMax(a: Int, b: Int, c: Int):Int
{
    if(a>b && a>c)
        return a;
    else if (b>a && b>c)
        return b;
    return c;
}