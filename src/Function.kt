fun main() {

    println(testSimple()) // 10
    println(testSimple3(5, 6)) //11

    testString(6) // String is 6

    // два варианта
    testNamedArguments(2, 4, 5)
    testNamedArguments(z = 5, x = 2, y = 4)

    testDefaultArguments(y = 6)             // аргумент функция
    testDefaultArguments(3, 4)       // аргумент функция


    printEvent(1,2,3,4,5,6,7,8)
    // ставим звездучку
    printEvent(*intArrayOf(1,2,3,4,5,6,7),8,9,12,323,4,45,45,546)
}


fun testSimple(): Int {
    return 5 + 5
}

// сокращенный вариант
fun testSimple2(): Int = 5 + 5

fun testSimple3(x: Int, y: Int): Int = x + y

fun testString(x: Int): String {
    return "String is $x"
}

fun testNamedArguments(x: Int, y: Int, z: Int): List<Int> {
    return listOf(x, y, z)
}

//void
fun testDefaultArguments(x: Int = 1, y: Int = 2) {// аргументы по умолчанию
    println(x + y)
}

//vararg
fun printEvent(vararg numbers: Int) { // вывод четных чисел
    println("Chetnie chisla ")
    numbers.forEach { e -> if (e % 2 == 0) println(e) }
}