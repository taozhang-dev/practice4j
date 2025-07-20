import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testMainOutput() {
        // Call the main method
        Main.main(new String[]{});

        // Define expected output
        String expectedOutput = "i = 1" + System.lineSeparator() +
                "i = 2" + System.lineSeparator() +
                "i = 3" + System.lineSeparator() +
                "i = 4" + System.lineSeparator() +
                "i = 5" + System.lineSeparator();

        // Verify the output
        assertEquals(expectedOutput, outContent.toString());
    }
}