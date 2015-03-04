/**
 * main
 */
object Main {
  def main = {
    val i = new Indexing("chaps/")

    println(i.makeTermAndDocIDPair(0)._2)
  }
}
