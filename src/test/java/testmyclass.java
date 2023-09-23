import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;



public class testmyclass {
    private myclass myclass;

    @BeforeEach
    public void setUp() {
        myclass = new myclass();
    }

    // Write your test methods here
    @Test
    public void testAdd() {
        int result = myclass.add(2, 3);
        assertEquals(5, result); // Assert that the result is equal to 5
    }
}

