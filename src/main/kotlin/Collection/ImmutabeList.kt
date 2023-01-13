
package Collection;

import java.util.*

fun main(args:Array<String>)
{
    var reader=Scanner(System.`in`)
    //Kotlin Support two type of List
    //1. Immutable List: Once you create you can not destroy

    //
    var x= listOf<String>("One","Two","Three");

    var y= mapOf<Int,Int>(1 to 1, 2 to 5, 4 to 6);
    var m=setOf(10,10,394,23,10);
    println("The value is the set are ${m.toString()}")
    println("the value of keys are ${y.keys}")
    for(z in y.keys){
        println(y.getValue(z));
    }

    //Create a array a find frequency of character;

    var arr=IntArray(10);

    for(i in 0..9){
        arr.set(i,reader.nextInt());
    }
    println(Arrays.toString(arr));


    val list= mutableListOf<String>("Afzal", "Getting", "Security");
  list.forEach(){
      println(it)
  }
    println(list.toString())
    for(i in x)
    {
       println(i);
    }
}