fun main(){
    /*
    2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

    What is the smallest positive number that is evenly divisible by all of the numbers from 1 to n?
     */

    print("Informe um numero n: ")
    var n = readln().toInt()

    var numeroInicial = n

    var acertos = 0

    while(true){

        for(i in 1..n){
            if(numeroInicial % i == 0){
                acertos += 1
            } else{
                break
            }
        }

        if(acertos == n){
            break
        }
        acertos = 0
        numeroInicial += 1
    }
    print(numeroInicial)
}