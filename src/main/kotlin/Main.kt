fun main(){
     val addNumberPhone = mutableListOf<String>()
     println("Enter a number:")
     var n :Int = readLine()?.toIntOrNull() ?: return      // ������ n - ����� ������� ��������
while (n <= 0) {                                           // ��������� ����n > 0, ���� ��� �� ���������� ������ ��������
     println("Error!")
     println("Enter another number: ")
     n = readLine()?.toIntOrNull() ?: return
     }
     var a = 1
     for (i in 1..n)  {
          println("Enter phone numbers �$a:")
          a++
     var phoneNumber :Int = readLine()?.toIntOrNull() ?: return  // ����� ����� �������� ������ ����������� � ������
        // addNumberPhone.add(phoneNumber)
     }


   /* fun lisadd (n: Int, addN: String) {                    // ��������� ���� ��� ������� ��������
        val addN = mutableListOf<String>()
        println("Enter the phone number:")
        val n = readln()
        for (i in 1..n) {
            addN.add(n)
        }
    }*/

}


