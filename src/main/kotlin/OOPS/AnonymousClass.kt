package OOPS
import OOPS.outer

fun main(args: Array<String>) {
    var programmer :Human = object:Human { // Anonymous class
        override fun think() { // overriding the think method
            print("I am an example of Anonymous Inner Class ")
        }
    }


    var person: Human=object :Human{
        override fun think() {
            print("this is my class")
        }
    }
    person.think()
    programmer.think()
    var p=Person("Afzal",23);

}
interface Human {
    fun think()
}
typealias user=Triple<String,String,Int>
fun get():user
{
    return user("First Name","Last Name",18)
}

class Person(val _name:String, val _age:Int)
{
    var name:String;
    var age:Int

    init{
        name=_name;
        age=_age
        println("The name is $name")
        println("The age is $age")
    }

}