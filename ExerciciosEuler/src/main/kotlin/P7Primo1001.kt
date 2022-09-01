fun main(){

    /*
    By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

    What is the nth prime number?
     */

    print("Informe n: ")
    val n = readln().toInt()

    var posicaoPrimo = 0
    var divisoresEncontrados = 0
    var numeroInicial = 1

    while(true){

        numeroInicial += 1
        divisoresEncontrados = 0

        for(i in 1..numeroInicial){
            if(numeroInicial % i == 0){
                divisoresEncontrados += 1
            }
            if(divisoresEncontrados > 2){
                break
            }
        }

        if(divisoresEncontrados == 2){
            posicaoPrimo += 1
        }

        if(posicaoPrimo == n){
            break
        }

    }

    println(numeroInicial)

}