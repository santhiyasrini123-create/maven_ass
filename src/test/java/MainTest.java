import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void testGradeA() {
        assertEquals("B", new Main().grade(95));
    }

    @Test
    public void testGradeB() {
        assertEquals("B", new Main().grade(85));
    }

    @Test
    public void testGradeF() {
        assertEquals("F", new Main().grade(45));
    }

    @Test
    public void testInvalidMarks() {
        assertThrows(IllegalArgumentException.class,
                () -> new Main().grade(110));
    }
}