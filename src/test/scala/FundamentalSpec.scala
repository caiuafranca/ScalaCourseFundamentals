

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
    test("Verifica se 3 é maior que 2"){
        val esperado = "A > B"
        assert(esperado == Fundamentals.verifica_maior_menor(3,2))

    }
    test("Verifica se 2 é maior que 3"){
        val esperado = "B > A"
        assert(esperado == Fundamentals.verifica_maior_menor(2,3))
    }
    test("Verifica se o valor eh igual"){
        val esperado = "valores são iguais"
        assert(esperado == Fundamentals.verifica_maior_menor(4,4))
    }
}
