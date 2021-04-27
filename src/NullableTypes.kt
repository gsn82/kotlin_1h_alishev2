fun main() {

    var a: String = "Hello"
    //    a = Null  // NPE исключено
    // можем вызвать
    println(a.length)

    // b - может быть Null
    var b: String? = "Test"
    b = null
    // не можем вызвать
    //println(b.length)

    //можем вызвать , только безопаснвй вызов
    // вернет длину b, если null -> null (не будет NPE!)
    println(b?.length)


    // Elvis оператор - ?:
    // есди b не равен Null то вернет длину, если b равен Null, то вернет -1
    val l = b?.length ?: -1

    b = if ((0..10).random() > 5) "asdf" else null

    //!! - выбрасывает NPE случае в переменной Null
    val t = b!!.length


}