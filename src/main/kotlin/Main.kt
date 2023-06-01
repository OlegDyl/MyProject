fun main(){
     val addNumberPhone = mutableListOf<String>()
     println("Enter a number:")
     var n :Int = readLine()?.toIntOrNull() ?: return      // вводим n - число номеров телефона
while (n <= 0) {                                           // проверяем чтобn > 0, если нет то предлогаем ввести повторно
     println("Error!")
     println("Enter another number: ")
     n = readLine()?.toIntOrNull() ?: return
     }
     var a = 1
     for (i in 1..n)  {
          println("Enter phone numbers №$a:")
          a++
     var phoneNumber :Int = readLine()?.toIntOrNull() ?: return  // нужно чтобы вводимые номера сохранялись в список
        // addNumberPhone.add(phoneNumber)
     }


   /* fun lisadd (n: Int, addN: String) {                    // придумать куда эту функцию засунуть
        val addN = mutableListOf<String>()
        println("Enter the phone number:")
        val n = readln()
        for (i in 1..n) {
            addN.add(n)
        }
    }*/

}


