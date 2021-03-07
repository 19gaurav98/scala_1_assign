package cli

import java.text.SimpleDateFormat
import java.util.Calendar

class DateFlag {
  def dateFlag() : String= {

    val format = new SimpleDateFormat("d-M-y")
    (format.format(Calendar.getInstance().getTime()))
   // "Version : 0.1"
  }
}