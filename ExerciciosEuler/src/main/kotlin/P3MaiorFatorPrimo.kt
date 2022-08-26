class P3MaiorFatorPrimo (
    private var numero: Int
){
    private var maiorDivisorPrimo = 1
    private var jaCalculou = false

    fun trocaNumero(numero:Int){
        this.numero = numero
    }

    /*
   The prime factors of 13195 are 5, 7, 13 and 29.
    */

    fun calculaMaiorPrimo(){
        for(i in numero downTo 1){
            if(numero % i == 0){
                if(verificaPrimo(i)){
                    maiorDivisorPrimo = i
                    break
                }
            }
        }
        jaCalculou = true
    }

    fun resultado(): String{
        if(jaCalculou){
            return "O maior divisor primo de $numero é: $maiorDivisorPrimo"
        }
        throw Exception ("Calcule o resultado primeiro!")
    }

    private fun verificaPrimo(numero: Int): Boolean {
        var divisores = 0
        var maximo = numero
        for(i in 1..maximo){
            if(numero % i == 0){
                divisores += 1
            }
        }

        if(divisores == 2){
            return true
        }
        return false
    }

}
