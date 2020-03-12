
package java.ci.pipeline;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class JavaCiPipelineTest {
    
    public JavaCiPipelineTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of add method, of class JavaCiPipeline.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        double x = 0.0;
        double y = 0.0;
        double expResult = 0.0;
        double result = JavaCiPipeline.add(x, y);
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    /**
     * Test of rest method, of class JavaCiPipeline.
     */
    @Test
    public void testRest() {
        System.out.println("rest");
        double x = 0.0;
        double y = 0.0;
        double expResult = 0.0;
        double result = JavaCiPipeline.rest(x, y);
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class JavaCiPipeline.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        double x = 0.0;
        double y = 0.0;
        double expResult = 0.0;
        double result = JavaCiPipeline.divide(x, y);
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiplie method, of class JavaCiPipeline.
     */
    @Test
    public void testMultiplie() {
        System.out.println("multiplie");
        double x = 0.0;
        double y = 0.0;
        double expResult = 0.0;
        double result = JavaCiPipeline.multiplie(x, y);
        assertEquals(expResult, result, 0.0);
        fail("The test case is a prototype.");
    }
    
}
