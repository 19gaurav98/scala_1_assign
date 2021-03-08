package cli

object Scala_parser extends App {
  val resultMap = (new CLIp).parser(args)

  for (key <- resultMap.keys) key match {
    case "date" => println(resultMap(key))
    case "reverseprint" => println(resultMap(key))
    case "help" => println(resultMap(key))
    case _ => throw new Exception("Wrong Arguments")
    
  }
}
