import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class P2NumerosParesFibonacciTest {

    @Test
    fun calculaNumerosParesFibonacci10() {
        val problema2 = P2NumerosParesFibonacci(10)
        problema2.calculaNumerosParesFibonacci()
        assertEquals("A soma dos numeros pares de fibonacci menores que 10 é: 10",problema2.mostraResultado())
    }

    @Test
    fun calculaNumerosParesFibonacci34() {
        val problema2 = P2NumerosParesFibonacci(34)
        problema2.calculaNumerosParesFibonacci()
        assertEquals("A soma dos numeros pares de fibonacci menores que 34 é: 44",problema2.mostraResultado())
    }

    @Test
    fun calculaNumerosParesFibonacci60() {
        val problema2 = P2NumerosParesFibonacci(60)
        problema2.calculaNumerosParesFibonacci()
        assertEquals("A soma dos numeros pares de fibonacci menores que 60 é: 44",problema2.mostraResultado())
    }

    @Test
    fun calculaNumerosParesFibonacci1000() {
        val problema2 = P2NumerosParesFibonacci(1000)
        problema2.calculaNumerosParesFibonacci()
        assertEquals("A soma dos numeros pares de fibonacci menores que 1000 é: 798",problema2.mostraResultado())
    }

    @Test
    fun calculaNumerosParesFibonacci100000() {
        val problema2 = P2NumerosParesFibonacci(100000)
        problema2.calculaNumerosParesFibonacci()
        assertEquals("A soma dos numeros pares de fibonacci menores que 100000 é: 60696",problema2.mostraResultado())
    }

    @Test
    fun calculaNumerosParesFibonacci4000000() {
        val problema2 = P2NumerosParesFibonacci(4000000)
        problema2.calculaNumerosParesFibonacci()
        assertEquals("A soma dos numeros pares de fibonacci menores que 4000000 é: 4613732",problema2.mostraResultado())
    }


}