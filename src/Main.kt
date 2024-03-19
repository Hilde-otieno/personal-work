//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    name("Akirachix")
    println(sentence("Megan", 20))
    println(word("Megan"))
    write("Megan")

    var fullName="Megan"
    println(fullName)
    var age=20
    println(age)
    var phoneNumber="+254902548687846"
    println(phoneNumber)
    var weight= 67.9
    println(weight)
    var citizen="Kenyan"
    isEven(16)
    println(separate("Aurellia"))
    temperature(37.06)
}
fun name(name:String){
    println(name[0])
    println(name[3])
    println(name[4])
}
fun sentence(x:String, y: Int):String{
    return("Hi, my name is $x and I am $y years old")

}
fun word(name:String):String{
    return("Megan")
}
fun write(name:String){
    if(name=="Megan")
    {println("that's me")}
    else{println("that's not me")}
}
 fun isEven(num:Int){
     if (num % 2==0)
     {println("true")
 } else {
         println("false")
 }
 }
fun separate(word:String):String{
    return(word.slice(2..5))
}
fun temperature(temp:Double){
    var statement="The temperature is $temp degrees celcius"
    println(statement)
}