
package ExceptionHandling


import java.lang.RuntimeException

class Lang{

}

fun divide(a:Int, b:Int){
    try{
        System.out.println(a/b);
    }
    catch (e:ArithmeticException){
        println("Can not divide by zero")
    }
    finally {
        println("This is finally block")
    }
    println("How can I help your");

}
fun voting(age:Double):String{
    if(age<18)
        return throw ArithmeticException("You are not eligible for voting");

    return "You are welcome to vote"
}
fun main(args:Array<String>)
{
    divide(3,0);
    println(voting(19.0));

    var firstName:String?="Afzal"
    var lastName:String?=null;
    println(lastName?.length)
    var num1 = 4
    println("This value is not posssible")
    var i:Int=0;
    outer@while(i<10){
        print("$i ");
        i++;
        if(i==10)
            break@outer
    }

}