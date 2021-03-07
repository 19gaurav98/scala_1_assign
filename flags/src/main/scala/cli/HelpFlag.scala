package cli

class HelpFlag {
  def helpFlag() = {
    val flagsMap = Map("-d" -> "It shows Todays date", "-h" -> "help", "-rp" -> "It print the reverse of the string Inputed")
    (flagsMap.map { case (k, v) => s" $k => $v " }).mkString("Usage: clip options [message]\n", "\n", "")
  }
}
