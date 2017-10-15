import java.awt.Rectangle
import java.io.File
import java.lang.Integer.parseInt

/*
*                 //*****//
*         /***********************/
*          ----/------------/----
*   /////*****/  RICK KOCK /*****/////
*         ---/------------/---
*       /*******/ 2017 /******/
*             //******//
*/

/** @param args {Array} String array */
fun main(args: Array<String>) {
    // var x = 5
    // x+=1

    // println("x is now $x")

    // printProduct("", "")

    // displayAList()

    // usingWhileLoop()

    // println (describe(1))

    // checkWithin(6, 4)

    // iterateOverProgression()

    val items = listOf<Int>(-1,-2, 5, 4)

    // Creating basic classes and their instances
    // val rectangle = Rectangle(5.0, 2.0)
    // val triangle = Triangle(3.0, 4.0, 5.0)


    // checkIfCollectionContainsObj(items)

    // useLambda(items)

    // Filtering a list
    val positives = items.filter { x -> x > 0 }

    // Or even shorter:
    val alternitPositives = items.filter { it > 0 }

    val newItems = mapOf("a" to 1, "b" to 2)

    // using map as an example
    // val map =

    // Traversing a map/list of pairs
//    for ((k, v) in newItems) {
//        println("$k -> $v")
//    }

    val files = File("Test").listFiles()

    // println(files?.size ?: "empty") // If null, prints out "Empty"


    // Will not compile
//    val myTurtle = Turtle()
//    with(myTurtle) {
//        penDown()
//        for (i in 1..4) {
//            penUp()
//        }
//    }

    // println(alternitPositives)

    val text = "Tell me and I forget.\n"+
    "Teach me and I remember.\n" +
    "Involve me and I learn\n"+
    "(Benjamin Franklin)"

    println(text)
}

data class Test(val name: String, val email: String)


fun printSum(a: Int, b:Int) = println("Sum of $a and $b is ${a + b}")

fun sum(a:Int, b:Int):Int {
    return a+b
}

fun newSum(a: Int, b:Int) = a+b

fun min(root: Int, new: Int):Int {
    return root - new
}

fun maxOf(a: Int, b:Int) = if (a > b) a else b

// Which is the equivalent of...
fun maxOfFun(a: Int, b:Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

// An expression must be explicitly marked as nullable
// when null value is possible
// fun parseInt(str: String):Int? {
    // ...
// }

fun printProduct(arg1: String, arg2: String) {
    val x = parseInt(arg1)
    val y = parseInt(arg2)

    if (x != null && y != null) {
        println(x * y)
    }

    else {
        println("Either $x or $y is not a number.")
    }
}

// Check to see if an expression is an instance of a type.
fun getStringLength(obj: Any):Int? {
    if (obj is String) {
        return obj.length
    }
    return null
}

// Using for loop
fun displayAList() {
    val items = listOf<String>("apple", "banana", "citrus")

    for (item in items) {
        println(item)
    }
}

// using a while loop
fun usingWhileLoop() {
    val items = listOf<String>("apple", "banana", "citrus") // What is the difference between a var and val?

    var index = 0
    while (index < items.size) {
        println(items[index])
        index++
    }
}

// Using when expressions
fun describe(obj: Any):String {
    return when (obj) {
        1 -> "One"
        else -> "unknown"
    }
}

// Check if a number is within a range using in operator
fun checkWithin(x:Int, y:Int) {
    if (x in 1..y+1) {
        println("fits in range")
    }
}

// Iterating over a range
fun iterateOverRange(x:Int, y:Int) {
    for (x in 0..y) {
        print(x)
    }
}

// Iterate over a progression
fun iterateOverProgression() {
    for (x in 0..10 step 2) {
        println(x)
    }
}

// Checking if a collection contains an object using in
fun checkIfCollectionContainsObj(items : Set<String>) {
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }
}

// Using lambda expressions
fun useLambda(items: List<String>) {
    items
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map{it.toUpperCase()}
            .forEach { println(it) }
}

// Default values for a function
fun defaultValues(a: Int = 0, name: String = "unknown") {

}

// What are lazy properties?

object Resource {
    val name = "Name"
}

// try/catch expression
fun test() {
    val result = try {
        count()
    } catch (e: ArithmeticException) {
        throw IllegalStateException(e)
    }
}

fun count(): Int { return 0 }


// Builder-style usage of methods that return Unit
fun arrayOfMinusOnes(size: Int): IntArray {
    return IntArray(size).apply { fill(-1) }
}

fun transform(color: String):Int = when (color) {
    "Red" -> 0
    "Green" -> 1
    else -> throw IllegalArgumentException("Invalid color param val.")
}

// Calling multiple methods on an object instance (with)
//class Turtle {
//    fun penDown()
//    fun penUp()
//    fun turn(degrees: Double)
//}

