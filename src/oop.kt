class safari{
   // data member
    var nambari=9

   // member function
    fun square(): Int{
        return nambari*nambari
    }
}

fun main(args: Array<String>) {
    // instance of an object
    val myobj=safari()
    println(myobj.square())
}

