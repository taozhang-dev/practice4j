import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.io.PrintStream
import kotlin.test.assertEquals

class MainKTest {
    private val outContent = ByteArrayOutputStream()
    private val originalOut = System.out

    @BeforeEach
    fun setUpStreams() {
        System.setOut(PrintStream(outContent))
    }

    @AfterEach
    fun restoreStreams() {
        System.setOut(originalOut)
    }

    @Test
    fun testMainOutput() {
        // Call the main method
        main()

        // Define expected output
        val expectedOutput = """i = 1
i = 2
i = 3
i = 4
i = 5
"""

        // Verify the output
        assertEquals(expectedOutput, outContent.toString())
    }
}