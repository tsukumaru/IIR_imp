
object Main {
  def main (args: Array[String]) = {
    //まだ仮段階
    //new Indexing(DIR)でDIR内の全てのファイルに対して実行できるようにしたい.
    val i = new Indexing
    val filePath = "chaps/1.1.html"
    println(i.extractContent(filePath))
  }
}
