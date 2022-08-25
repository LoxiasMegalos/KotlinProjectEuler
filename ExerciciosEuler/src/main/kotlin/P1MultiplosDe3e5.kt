class P1MultiplosDe3e5(
    private var numero:Int
) {

    /*
    If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
    The sum of these multiples is 23.
    Find the sum of all the multiples of 3 or 5 below the provided parameter value number.
     */

    private var soma = 0
    private var calculoRealizado = false

    fun resultado():String{
        if(calculoRealizado){
            return "A soma dos multiplos de 3 e 5 abaixo de $numero é: $soma"
        }
        throw Exception ("Calcule ao menos uma vez o resultado para que obtenha o resultado")
    }

    fun calculaResultado(){
        for(i in 1 until numero){
            if(i % 3 == 0 || i % 5 == 0){
                soma += i
            }
        }
        calculoRealizado = true
    }

    fun escolheNovoNumero(novoNumero: Int){
        numero = novoNumero
    }

    fun getNumero():Int{
        return numero
    }
}