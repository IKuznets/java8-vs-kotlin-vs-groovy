package com.kuznietsov.javavskotlinvsgroovy.basics.types

class Kotlin {

    /** Numbers **/

    val double = 12.5
    val float = 12.5f
    val long = 64L
    val int = 32
    val short: Short = 16
    val byte: Byte = 8

    /** Underscores in numeric literals **/

    val oneMillion = 1_000_000

    /** Characters **/

    /** Booleans **/



    /** Arrays **/

    val x: IntArray = intArrayOf(1, 2, 3)

    /** String Literals **/

    val hello = "Hello, world!\n"
    val text = """
        for (c in "foo")
            print(c)
    """

    /** String Templates **/

    val s = "abc"
    val str = "$s.length is ${s.length}"
}