/**
 * main
 */
object Main {
  def main(args: Array[String]) = {
    //mainの中身は適当
    val i = new Indexing("chaps/")
    val a = i.extractContent("chaps/1.1.html")
    val b = i.removeHTMLTag(a)
    val c = i.translateIntoTerms(b)
    //i.makeTermAndDocIDPair.foreach(println(_))
    println(c.deep)
  }
}
