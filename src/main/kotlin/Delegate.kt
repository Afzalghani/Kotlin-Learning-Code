
import kotlin.properties.Delegates
import kotlin.reflect.KProperty


class Student{

    var firstName:String? by NameDelegate();
    var lastName:String? by NameDelegate();

    //Observable method is used to check old and new value
    var marks: Int by Delegates.observable(50){property, oldValue, newValue ->

        println("The old value is $oldValue");
        println("The new value is $newValue");
    }

    //This is the Delegates function which is used to compare new and old value
    var age:Int by Delegates.vetoable(14){property, oldValue, newValue ->
        println("The old value is $oldValue");
        println("The new value is $newValue");
        newValue>oldValue
    }

    override fun toString(): String {
        return "first Name is ${firstName} and the seond Name is $lastName";
    }


}

class NameDelegate{
    var formatted:String?=null
    operator  fun setValue(
        thisRef: Any?,
        property:KProperty<*>,
        value: String?)
    {
        if(value!=null && value.length>5)
        {
            formatted=value.trim().uppercase();
        }
    }
    operator fun getValue(thisRef: Any?,property: KProperty<*>):String?{
        return formatted;
    }
}

fun main(args:Array<String>){
    var stu=Student();
    stu.firstName="Afzal "
    stu.lastName=" Ghani "
    stu.marks=12;
    stu.age=15;

    println(stu.toString());
}