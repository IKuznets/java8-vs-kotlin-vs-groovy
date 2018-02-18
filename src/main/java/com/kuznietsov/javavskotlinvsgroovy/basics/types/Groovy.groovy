package com.kuznietsov.javavskotlinvsgroovy.basics.types

class Groovy {

    /** Numbers **/

    double d = 12.5
    float f = 12.5f
    long l = 64L
    int i = 32
    short s = 16
    byte b = 8

    BigInteger bi =  6
    BigDecimal bd =  6.5

    /** Underscores in numeric literals **/

    int oneMillion = 1_000_000

    /** Characters **/

    char c1 = 'A'
    def c2 = 'B' as char
    def c3 = (char)'C'

    /** Booleans **/

    def myBooleanVariable = true
    boolean untypedBooleanVar = false

    /** Arrays **/

    String[] arrStr = ['Ananas', 'Banana', 'Kiwi']
    def numArr = [1, 2, 3] as int[]
    def matrix3 = new Integer[3][3]

    /** Lists **/

    def numbers = [1, 2, 3]
    def heterogeneous = [1, "a", true]
    def linkedList = [2, 3, 4] as LinkedList
    def letters = ['a', 'b', 'c', 'd']
    def multi = [[0, 1], [2, 3]]

    /** Maps **/

    def colors = [red: '#FF0000', green: '#00FF00', blue: '#0000FF']
    def mapOfNumbers = [1: 'one', 2: 'two']
    def key = 'name'
    def person = [(key): 'Guillaume']

    /** String Literals **/

    def single = 'a single quoted string'
    def aMultilineString = '''line one
                                line two
                            line three'''

    /** String Templates **/

    def name = 'Guillaume'
    def greeting = "Hello ${name}"
}
