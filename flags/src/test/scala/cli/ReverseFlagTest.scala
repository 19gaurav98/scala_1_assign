package cli
import org.scalatest.flatspec.AnyFlatSpec
class ReverseFlagTest extends AnyFlatSpec {




    "Print flag" should "return message in uppercase" in {
      val reverseFlagTest = new ReverseFlag()

      val resultString = reverseFlagTest.reverseFlag("test")

      assert(resultString == "tset")
    }

  }
