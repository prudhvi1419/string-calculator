import static org.junit.Assert.*;  
import org.junit.Test;  
  
public class CalculatorTest {  
  
    @Test  
    public void testAddWithEmptyStringValue(){  
        assertEquals(0,Calculator.add(""));    
    }  
}  
