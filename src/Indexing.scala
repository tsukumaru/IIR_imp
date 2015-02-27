import scala.io.Source

class Indexing {
  private def file2String(filePath: String): String =
   Source.fromFile(filePath).getLines.mkString

  def extractContent(filePath: String): String = {
    val fileContent = file2String(filePath)
    """<TITLE>.*</TITLE>|<!--End of Navigation Panel-->.*<!--Navigation Panel-->""".r
      .findAllMatchIn(fileContent).mkString
  }
}
