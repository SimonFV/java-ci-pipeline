
package main.java.ci.pipeline;
import org.junit.Test;
import static org.junit.Assert.*;

public class JavaCiPipelineTest {
    public JavaCiPipelineTest() {
    }
    
    /**
     * Test of add method, of class JavaCiPipeline.
     */
    @Test
    public void testAdd() {
        System.out.println("add_first_test");
        int x = 3;
        int y = 24;
        int expResult = 27;
        int result = JavaCiPipeline.add(x, y);
        assertEquals(expResult, result, 0.0);
        
        if(result != expResult){
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testAdd2() {
        System.out.println("add_second_test");
        int x = 34;
        int y = -5;
        int expResult = 29;
        int result = JavaCiPipeline.add(x, y);
        assertEquals(expResult, result, 0.0);
        
        if(result != expResult){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of subtract method, of class JavaCiPipeline.
     */
    @Test
    public void testSubtract() {
        System.out.println("rest_first_test");
        int x = 45;
        int y = -56;
        int expResult = 101;
        int result = JavaCiPipeline.subtract(x, y);
        assertEquals(expResult, result, 0.0);
        
        if(result != expResult){
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testSubtract2() {
        System.out.println("rest_second_test");
        int x = 68;
        int y = 96;
        int expResult = -28;
        int result = JavaCiPipeline.subtract(x, y);
        assertEquals(expResult, result, 0.0);
        
        if(result != expResult){
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of divide method, of class JavaCiPipeline.
     */
    @Test
    public void testDivide() {
        System.out.println("divide_first_test");
        int x = 22;
        int y = 5;
        int expResult = 4;
        int result = JavaCiPipeline.divide(x, y);
        assertEquals(expResult, result, 0.0);
        
        if(result != expResult){
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testDivide2() {
        System.out.println("divide_second_test");
        int x = 68;
        int y = -4;
        int expResult = -17;
        int result = JavaCiPipeline.divide(x, y);
        assertEquals(expResult, result, 0.0);
        
        if(result != expResult){
            fail("The test case is a prototype.");
        }
    }
    
    /**
     * Test of multiply method, of class JavaCiPipeline.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply_first_test");
        int x = 45;
        int y = 5;
        int expResult = 225;
        int result = JavaCiPipeline.multiply(x, y);
        assertEquals(expResult, result, 0.0);
        
        if(result != expResult){
            fail("The test case is a prototype.");
        }
    }
    
    @Test
    public void testMultiply2() {
        System.out.println("multiply_second_test");
        int x = 27;
        int y = -3;
        int expResult = -81;
        int result = JavaCiPipeline.multiply(x, y);
        assertEquals(expResult, result, 0.0);
        
        if(result != expResult){
            fail("The test case is a prototype.");
        }
    }
    
}
