fun main(args: Array<String>) {
//    var num=9
//    if (num%2==0){
//        println("$num is an even number")
//    }else{
//        println("$num is an odd number")
//    }
    val enterednum = readln()
    print("Enter number:")
    if (enterednum< 0.toString()){
        println("$enterednum is negative")
    }else{
        println("$enterednum is positive")
    }
}