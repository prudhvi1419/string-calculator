import static org.junit.Assert.*;  
import org.junit.Test;  
  
public class CalculatorTest {  
  
    @Test  
    public void testAddWithEmptyStringValue(){  
        assertEquals(0,Calculator.add(""));    
    }
    
    @Test
    public void testAddWithNumbersHappyPath() {
    	assertEquals(4, Calculator.add("2,2"));
    }
    
    @Test
    public void testAddWithNumbersFailure() {
    	assertFalse(Calculator.add("2,7")==8);
    }
    
    @Test
    public void testAddWithNewLines() {
    	assertEquals(8, Calculator.add("2\n3,3"));
    }
}  
