fun main() {
    println("Enter the number of contacts: ")
    var n = readLine()?.toIntOrNull() ?: return
    while (n <= 0) {
        println("Number [$n] Invalid Value! \n Enter another number" )
        n = readLine()?.toIntOrNull() ?: return
    }
    println("Number [$n] accept")
    println("Enter You Phone Numbers: ")
    val contactList = mutableListOf<String>()
    for (i in 0..n) {
        contactList.add(readLine().toString())
        Thread.sleep(1000) // х.з что это
    }
}