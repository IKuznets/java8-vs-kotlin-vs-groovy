package com.kuznietsov.javavskotlinvsgroovy.basics.control

import java.lang.Integer.parseInt

class Kotlin {

    /** If Expression **/

    fun traditionalUsage(a: Int, b: Int) {
        var max = a
        if (a < b) max = b
        print(max)
    }

    fun withElse(a: Int, b: Int) {
        val max: Int
        if (a > b) {
            max = a
        } else {
            max = b
        }
        print(max)
    }

    fun asExpression(a: Int, b: Int) {
        val max = if (a > b) {
            print("Choose a")
            a
        } else {
            print("Choose b")
            b
        }
        print(max)
    }

    /** When Expression **/

    fun simplestWhen(x: Int) {
        when (x) {
            1 -> print("x == 1")
            2 -> print("x == 2")
            else -> { // Note the block
                print("x is neither 1 nor 2")
            }
        }
    }

    fun branchConditionsWithAComma(x: Int) {
        when (x) {
            0, 1 -> print("x == 0 or x == 1")
            else -> print("otherwise")
        }
    }

    fun branchConditions(x: Int, s: String) {
        when (x) {
            parseInt(s) -> print("s encodes x")
            else -> print("s does not encode x")
        }
    }

    fun checkValueInARange(x: Int, vararg validNumbers: Int) {
        when (x) {
            in 1..10 -> print("x is in the range")
            in validNumbers -> print("x is valid")
            !in 10..20 -> print("x is outside the range")
            else -> print("none of the above")
        }
    }

    fun hasPrefix(x: Any) = when(x) {
        is String -> x.startsWith("prefix")
        else -> false
    }

    /** For Loops **/

    fun foreachLoop(collection: ArrayList<Int>) {
        for (item in collection) print(item)
    }

    fun foreachWithBlock(ints: List<Int>) {
        for (item: Int in ints) {
            print(item)
        }
    }

    fun iterateWithAnIndex(array: List<Int>) {
        for (i in array.indices) {
            print(array[i])
        }
    }

    fun withIndexLibraryFunction(array: List<Int>) {
        for ((index, value) in array.withIndex()) {
            println("the element at $index is $value")
        }
    }

    /** While Loops **/

    fun whileExample(_x: Int) {
        var x = _x
        while (x > 0) {
            x--
        }
    }

    fun doWhileExample() {
        do {
            val y = retrieveData()
        } while (y != null)
    }

    private fun retrieveData(): Int {
        return 5
    }
}