fun main() {
    println("Enter a number:")
    var n: Int = readLine()?.toIntOrNull() ?: return      // вводим n - число номеров телефона
    while (n <= 0) {                                           // проверяем чтобn > 0, если нет то предлогаем ввести повторно
        println("Error!")
        println("Enter another number: ")
        n = readLine()?.toIntOrNull() ?: return
    }
    val addNumberPhone = mutableListOf<String>()
    var a = 1
    for (i in 1..n) {
        println("Enter phone numbers №$a:")
        a++
        addNumberPhone.add(readLine().toString())
    }
    println(addNumberPhone)

    val filterSeven = addNumberPhone.filter { it.contains("+7") }
    println(filterSeven)

   // var a: String? = addNumberPhone.toSet()
   // println(a)
}
