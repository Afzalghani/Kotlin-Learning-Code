package Collection

import java.util.*
import kotlin.collections.ArrayList

fun main(args: Array<String>)
{
    var list1=ArrayList<Int>();
    for(i in 1..20)
    {
     //println("the value of i in this sequece is $i");
        list1.add(i);
    }
    println(list1)
    var list2=ArrayList<Int>();
   list2.add(233);
    list2.add(23);
    list2.add(11)

    println(list1+list2)
}
