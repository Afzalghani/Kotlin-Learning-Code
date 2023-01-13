import  java.util.Scanner;


//In Enum class the parameter are the object and it is mandatory to inilialize them
enum class Direction(var direction: String, var distance: Int){
    North("north",20),
    South("south",30),
    West("west",50),
    East("east",30);
}
fun main(args:Array<String>)
{
    var reader=Scanner(System.`in`)
    println("Enter the value of the a ")
    var a: Int=reader.nextInt();
    println("Enter the value of the b")
    var b: Int=reader.nextInt();
    System.out.println(find(a,b));

    var case: Int=reader.nextInt();
    System.out.println(Direction.East);
    when(case){
       1,2,3,4,5->{

        }
        else->{

        }
    }
}
fun find(a:Int, b:Int):Int{
    return a+b;
}
