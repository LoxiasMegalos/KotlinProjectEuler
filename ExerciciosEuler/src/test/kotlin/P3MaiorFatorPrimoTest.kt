import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class P3MaiorFatorPrimoTest {

    @Test
    fun calculaMaiorPrimoDivisorDe2() {
        var problema3 = P3MaiorFatorPrimo(2)
        problema3.calculaMaiorPrimo()
        assertEquals("O maior divisor primo de 2 é: 2",problema3.resultado())
    }

    @Test
    fun calculaMaiorPrimoDivisorDe3() {
        var problema3 = P3MaiorFatorPrimo(3)
        problema3.calculaMaiorPrimo()
        assertEquals("O maior divisor primo de 3 é: 3",problema3.resultado())
    }

    @Test
    fun calculaMaiorPrimoDivisorDe5() {
        var problema3 = P3MaiorFatorPrimo(5)
        problema3.calculaMaiorPrimo()
        assertEquals("O maior divisor primo de 5 é: 5",problema3.resultado())
    }

    @Test
    fun calculaMaiorPrimoDivisorDe7() {
        var problema3 = P3MaiorFatorPrimo(7)
        problema3.calculaMaiorPrimo()
        assertEquals("O maior divisor primo de 7 é: 7",problema3.resultado())
    }

    @Test
    fun calculaMaiorPrimoDivisorDe8() {
        var problema3 = P3MaiorFatorPrimo(8)
        problema3.calculaMaiorPrimo()
        assertEquals("O maior divisor primo de 8 é: 2",problema3.resultado())
    }

    @Test
    fun calculaMaiorPrimoDivisorDe13195() {
        var problema3 = P3MaiorFatorPrimo(13195)
        problema3.calculaMaiorPrimo()
        assertEquals("O maior divisor primo de 13195 é: 29",problema3.resultado())
    }
}