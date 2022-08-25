import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach

internal class P1MultiplosDe3e5Test {

    @Test
    fun resultado49Test() {
        val problema1 = P1MultiplosDe3e5(49)
        problema1.calculaResultado()
        assertEquals("A soma dos multiplos de 3 e 5 abaixo de 49 é: 543", problema1.resultado())
    }

    @Test
    fun resultado1000Test() {
        val problema1 = P1MultiplosDe3e5(1000)
        problema1.calculaResultado()
        assertEquals("A soma dos multiplos de 3 e 5 abaixo de 1000 é: 233168", problema1.resultado())
    }

    @Test
    fun resultado8456Test() {
        val problema1 = P1MultiplosDe3e5(8456)
        problema1.calculaResultado()
        assertEquals("A soma dos multiplos de 3 e 5 abaixo de 8456 é: 16687353", problema1.resultado())
    }

    @Test
    fun resultado19564Test() {
        val problema1 = P1MultiplosDe3e5(19564)
        problema1.calculaResultado()
        assertEquals("A soma dos multiplos de 3 e 5 abaixo de 19564 é: 89301183", problema1.resultado())
    }

}