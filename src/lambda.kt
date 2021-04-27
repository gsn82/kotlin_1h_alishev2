fun main() {
    val a = listOf(1, 2, 3, 4, 5, 6)

    a.forEach { e -> println(e) }

    println(a.map { e -> e * 2 })

    println(a.filter { e -> e % 2 == 0 })

    println(a.reduce { sum, e -> sum + e }) // sum()

    a.sortedByDescending { it } // сортировка в обратном порядке

    // если ли хотябы один элемент, больше 10
    a.any { it > 10 } // false

    // если все элементы меньше 10
    a.all { it < 10 } // true

    a.sum()  // сумма

    val number = listOf(1, 3, -4, 2, -11)
    // разбиваем на два массива , по условию
    // positive - положительные ,
    // negative  - отриц
    val (positive, negative) = number.partition { it > 0 }


    println(positive)
    println(negative)
}