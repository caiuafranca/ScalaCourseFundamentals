import scala.io.StdIn.readLine

object Fundamentals {

  def main(args: Array[String]): Unit = {

    var valor = readLine("Entre com um numero: ").toInt
    verifica_par_inpar(valor)

  }
  def verifica_par_inpar(valor: Int): Boolean ={

    if (valor % 2 == 0) {
      true
    } else {
      false
    }

  }
}
