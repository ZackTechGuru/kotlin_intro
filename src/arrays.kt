fun main(args: Array<String>) {
    var myarr= arrayOf("Zack","Joy",true,78,67,98f,'e')
    myarr[0]="John"
    println("My name is ${myarr[0]}")
    var myintarr= arrayOf<Int>(12,56,0,3,-1)
    println("I love eating ${myarr[0]}")
    val myarr2 = arrayOf<Int>(5,-7,8,9,1,2)
    println(myarr2.sorted())


}