import kotlin.math.pow

fun main(){

    /*
    The sum of the squares of the first ten natural numbers is,

    12 + 22 + ... + 102 = 385
    The square of the sum of the first ten natural numbers is,

    (1 + 2 + ... + 10)2 = 552 = 3025
    Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

    Find the difference between the sum of the squares of the first n natural numbers and the square of the sum.
     */

    print("Informe n: ")
    val n = readln().toInt()

    var somaDosQuadradosAteN = 0
    var quadradoDaSomaDeN = 0

    for(i in 1..n){
        somaDosQuadradosAteN += (i.toDouble().pow(2)).toInt()
        quadradoDaSomaDeN += i
    }
    quadradoDaSomaDeN = (quadradoDaSomaDeN.toDouble().pow(2)).toInt()

    println("${quadradoDaSomaDeN - somaDosQuadradosAteN}")
}