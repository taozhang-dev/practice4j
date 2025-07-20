import org.junit.jupiter.api.{AfterEach, BeforeEach, Test}
import org.junit.jupiter.api.Assertions.assertEquals
import java.io.{ByteArrayOutputStream, PrintStream}

class MainSTest {
  private var outContent: ByteArrayOutputStream = _
  private var originalOut: PrintStream = _

  @BeforeEach
  def setUpStreams(): Unit = {
    outContent = new ByteArrayOutputStream()
    originalOut = System.out
    System.setOut(new PrintStream(outContent))
  }

  @AfterEach
  def restoreStreams(): Unit = {
    System.setOut(originalOut)
  }

  @Test
  def testMainOutput(): Unit = {
    // Call the main method
    MainS.main(Array())

    // Define expected output
    val expectedOutput =
      """i = 1
i = 2
i = 3
i = 4
i = 5
"""

    // Verify the output
    assertEquals(expectedOutput, outContent.toString)
  }
}