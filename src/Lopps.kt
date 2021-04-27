fun main(){
    // for each
    val items = listOf("apple", "banana", "orange") // list.of Java9
   // mutableListOf("apple", "banana", "orange") // ArrayList

    for (intem in items)
        println(intem)

    //while
    var index =0;
    while (index<items.size){
        println("Item at $index is ${items[index]}")
        index++;
    }

    //диапозоны
    println(5 in 3..10)

    for (i in 1..10 )
        println(i)

    for (i in 14 until 20)
        println(i)

    for (i in 10 downTo 1 )
        println(i)

    for (i in 0..100 step 4)
        println(i)

}