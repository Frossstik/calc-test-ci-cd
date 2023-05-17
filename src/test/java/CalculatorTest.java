import com.lul.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void summation(){
        assertEquals(2, calculator.sum(1,1));
    }

    @Test
    void subtraction(){
        assertEquals(1, calculator.sub(2,1));
    }

    @Test
    void multiple(){
        assertEquals(4, calculator.mult(2,2));
    }

    @Test
    void division(){
        assertEquals(3, calculator.div(6,2));
    }
}
