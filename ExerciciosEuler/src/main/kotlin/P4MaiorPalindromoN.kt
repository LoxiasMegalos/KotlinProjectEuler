fun main(){

    /*
    A palindromic number reads the same both ways.
    The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
    Find the largest palindrome made from the product of two n-digit numbers.
     */

    print("Informe um numero n: ")
    val n = readln().toInt()

    var numero1 = 0
    var numero2 = 0

    while(n != numero1.toString().length){
        numero1 += 10
    }

    numero2 = (numero1 * 10) - 1
    var maiorPalindromo = 0

    if(n == 1){
        numero1 = 1
        numero2 = 9
    }


    for(numeroPrimario in numero2 downTo  numero1){
        for(numeroSecundario in numero2 downTo numero1){

            var resultado = numeroPrimario * numeroSecundario
            var resultadoString = resultado.toString()

            var tamanho = resultadoString.length
            var comparacoesNecessarias = tamanho
            var comparacoes = 0
            var comparacoesCorretas = 0

            if(tamanho % 2 != 0 && tamanho > 1){
                comparacoesNecessarias -= 1
            }

            var i = 1

            for(numero in resultadoString){
                comparacoes += 1
                if(numero == resultadoString[tamanho-i]){
                    comparacoesCorretas += 1
                }
                i += 1
                if(comparacoes == comparacoesNecessarias){
                    break
                }
            }

            if(comparacoesCorretas == comparacoesNecessarias){
                if(resultado > maiorPalindromo){
                    maiorPalindromo = resultado
                }
            }

        }

    }

    println(maiorPalindromo)
}