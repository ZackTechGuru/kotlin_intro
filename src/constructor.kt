class safaristudents(val jina: String,val miaka:Int, val jinsia: String,){

}
fun main(args: Array<String>) {
    val myobj=safaristudents("Zack",12,"male")
    println("My name is ${myobj.jina} I am ${myobj.miaka} years old and my gender is ${myobj.jinsia}")
    val myobj2=safaristudents("Lucy",14,"female")
    println("My name is ${myobj2.jina} my age is ${myobj2.miaka} and I am a ${myobj2.jinsia}")
    val myobj3=safaristudents("Taji",10,"male")
    println("My name is ${myobj3.jina}, I am ${myobj3.miaka} years old and I am ${myobj3.jinsia}")
}
