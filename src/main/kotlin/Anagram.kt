import java.util.SimpleTimeZone

fun main(args:Array<String>) {


    var l= IntArray(26){0}
    var str: String="afzalghani";
    var str1:String="fzaalanihg";
    for(x in str)
    {
     l.set(x-'a',l.get(x-'a')+1);
    }

    for(y in str1)
    {
        l.set(y-'a',l.get(y-'a')-1);
    }

for(z in l)
{
  if(z!=0)
  {
      println("Not Possible")
      return
  }
}
    println("Anagram")

}