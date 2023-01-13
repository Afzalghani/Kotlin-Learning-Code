package OOPS
class Bank( Account_Namer:String,Account_Number:Int){


}

//Outer and inner class
//Inner class and nested class are different
//Inner class can be accessible via object of the outer class
class outer{
    var name:String="Afzal"

    inner class  inn{
        var check:String="I am inner class"

        fun Print()
        {
            println(check)
        }
    }
}
fun main(args:Array<String>)
{
    var out=outer();
    var inn=out.inn();
    inn.Print()

}