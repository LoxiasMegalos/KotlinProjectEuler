fun main(){

    /*
    Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2,
    the first 10 terms will be:
    1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
    By considering the terms in the Fibonacci sequence whose values do not exceed n, find the sum of the even-valued terms.
     */

    var soma = 0

    print("Insira um numero: ")
    val n = readln().toInt()

    var fibonacci = 1
    var anterior = 0
    var suporte:Int

    while(true){

        suporte = fibonacci
        fibonacci += anterior
        anterior = suporte

        if(fibonacci % 2 == 0){
            soma += fibonacci
        }


        if(fibonacci > n){
            break
        }

    }

    println("A soma dos numeros pares de fibonacci menores que $n é: $soma")

}