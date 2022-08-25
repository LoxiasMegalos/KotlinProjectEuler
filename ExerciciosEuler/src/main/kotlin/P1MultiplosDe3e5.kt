fun main(){

    /*
    If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
    The sum of these multiples is 23.
    Find the sum of all the multiples of 3 or 5 below the provided parameter value number.
     */


    var soma = 0

    print("Digite um numero: ")
    val numero = readln().toInt()

    for(i in 1 until numero){
        if(i % 3 == 0 || i % 5 == 0){
            soma += i
        }
    }

    println("A soma dos multiplos de 3 e 5 abaixo de $numero é: $soma")

}