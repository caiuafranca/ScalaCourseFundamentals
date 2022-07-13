

import org.scalatest.funsuite.AnyFunSuite

class FundamentalSpec extends AnyFunSuite{

    test("Verificar se 2 eh par"){
        println(Fundamentals.verifica_par_inpar(2))
        val esper = Fundamentals.verifica_par_inpar(2)
        assert(esper == true)
    }

    test("Verificar se 3 eh impar"){
        val esperado = false
        assert(esperado == Fundamentals.verifica_par_inpar(3))
    }
}
