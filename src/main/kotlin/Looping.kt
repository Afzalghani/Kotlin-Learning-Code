
fun main(args: Array<String>) {
    for(i in 1.rangeTo(20).step(2))
    {
        print(i)
    }
    for(i in 1..20)
        print("$i ")

  println(fact(5))

    println(calculator(4,5,::add));

    for(i in 20 downTo 1 step 3)
    {
        println("The value of the i in each Iteration is $i");
    }



}
fun fact(a:Int):Int{
    if(a==0 || a==1)
        return 1;
    return a*fact(a-1);
}
fun add(a:Int,b: Int):Int{
    return a+b;
}
fun calculator(a:Int,b:Int,operation:(Int,Int)->Int):Int{
    return operation(a,b);
}