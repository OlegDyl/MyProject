fun main(){
    println("Enter a number:")
    var n :Int = readLine()?.toIntOrNull() ?: return
    while (n <= 0) {
        println("Error!")
        println("Enter another number: ")
        n = readLine()?.toIntOrNull() ?: return
    }
    val addNumberPhone = mutableListOf<String>()
    var a = 1
    for (i in 1..n)  {
        println("Enter phone numbers №$a:")
        a++
        addNumberPhone.add(readLine().toString())
    }
    println(addNumberPhone)

    val filterSeven = addNumberPhone.filter {it.contains("+7")}
    println(filterSeven)

}