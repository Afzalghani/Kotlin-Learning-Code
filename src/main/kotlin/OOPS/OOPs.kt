package OOPS


abstract  class Company1(val name:String, val experience:String)
{
   abstract var salary:Double;

    abstract  fun DateOfBirth(date:String);

    fun EmployeeDetails(){
        println("The name of the Employee is $name");
        println("The Experience of the employee is $experience")
        println("The Salary of the employee is $salary")
    }

}
class Enginner(name:String,experience: String): Company1(name,experience){
    override var salary=5000.00;

    override fun DateOfBirth(date: String) {
        println("The date of Birth is $date")
    }

}
fun main(args:Array<String>){
    val eng=Enginner("Afzal","20");
    eng.DateOfBirth("2034,34,4");
}
abstract  class Ecommerce{
    var name:String="";

    abstract fun move();
    abstract fun chekc();

}
class first: Ecommerce()
{
    override fun move() {
        TODO("Not yet implemented")
    }

    override fun chekc() {
        TODO("Not yet implemented")
    }
}

open class Company {
    var name: String = ""
        get() = field	 // getter
        set(value) {		 // setter
            field = value
        }
}



class car(name: String)
{
    var name:String =""
        get() = field;
        set(value) {field=value}




    fun moving()
    {
        println("Moving towards the journey")
    }
    fun stop(){
        println("Stop please")
    }
}

