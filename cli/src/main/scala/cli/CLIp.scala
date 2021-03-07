package cli

import scala.collection.mutable

class CLIp {
  def parser(args: Array[String]): mutable.HashMap[String, String] = {
    if (args.length == 0)
      return mutable.HashMap("help" -> (new HelpFlag).helpFlag())
    else if (args.length > 2)
      return mutable.HashMap("help" -> (new HelpFlag).helpFlag())
    else if ((args(0) startsWith "-") && (args.length == 2)) {
      if (args(1) startsWith "-")
        return mutable.HashMap("help" -> (new HelpFlag).helpFlag())
    }


    for (arg <- args.indices if args(arg) startsWith "-") {
      args(arg) match {
        case "-r" | "--reverseprint" => return mutable.HashMap("print" -> (new ReverseFlag).reverseFlag(if (arg == 0) args(arg + 1) else args(arg - 1)))

        case "-d" | "--date" => return mutable.HashMap("version" -> (new DateFlag).dateFlag())

        case "-h" | "--help" => return mutable.HashMap("help" -> (new HelpFlag).helpFlag())

        case _ => "Please do not provide more than 2 flags"

      }
    }
    mutable.HashMap("help" -> (new HelpFlag).helpFlag())
  }
}