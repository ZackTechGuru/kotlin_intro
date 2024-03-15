class maths{
    var num1=23
    var num2=12

    fun add():Int{
        return num1+num2
    }
}

fun main(args: Array<String>) {
    val myobj=maths()
    println(myobj.add())
}