package unit14_cancerunittests;

import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *   JUnit test for cancer screening class
 */
public class Unit14_CancercreeningTest {
       
    /** ============================================================
     * Tests of readRadius method 
     *  ============================================================ 
     */
    @Test
    public void testGoodRadius() {
        // Arrange -- set up things for the test
        String keyboardInput = "0.1 \n";
        Scanner simulateKeyboard = new Scanner(keyboardInput);
        double expectedResult = 0.1;
        
        // Act -- run the method to be tested
        double result = Unit14_CancerScreening.readRadius(simulateKeyboard);
        
        // Assert -- check the results usins Assert
        assertEquals(expectedResult, result, 0.0000001);
    }
    
        @Test
    public void testInvalidRadiusLow() {
        String keyboardInput = "0.05 \n  -1.5  \n  2.0   \n";
        Scanner simulateKeyboard = new Scanner(keyboardInput);
        double expectedResult = 2.0;

        double result = Unit14_CancerScreening.readRadius(simulateKeyboard);

        assertEquals(expectedResult, result, 0.0000001);
    }

    @Test
    public void testInvalidRadiusHigh() {
        String keyboardInput = "30.0 \n 24.0 \n";
        Scanner simulateKeyboard = new Scanner(keyboardInput);
        double expectedResult = 24.0;

        double result = Unit14_CancerScreening.readRadius(simulateKeyboard);

        assertEquals(expectedResult, result, 0.0000001);
    }

//    @Test
//    public void testInvalidInputNonNumeric() {
//        String keyboardInput = "abc\n2.5\n";
//        Scanner simulateKeyboard = new Scanner(keyboardInput);
//        double expectedResult = 2.5;
//
//        double result = Unit14_CancerScreening.readRadius(simulateKeyboard);
//
//        assertEquals(expectedResult, result, 0.0000001);
//    }

    @Test
    public void testInvalidInputNegative() {
        String keyboardInput = "-3.0  \n  4.5  \n";
        Scanner simulateKeyboard = new Scanner(keyboardInput);
        double expectedResult = 4.5;

        double result = Unit14_CancerScreening.readRadius(simulateKeyboard);

        assertEquals(expectedResult, result, 0);
    }


    /** ============================================================
     * Tests of readConcavity method 
     *  ============================================================ 
     */
    @Test
    public void testReadConcavity() {
        // Arrange -- set up things for the test
        String keyboardInput = "0.1 \n";
        Scanner simulateKeyboard = new Scanner(keyboardInput);
        double expectedResult = 0.1;
        
        // Act -- run the method to be tested
        double result = Unit14_CancerScreening.readConcavity(simulateKeyboard);
        
        // Assert -- check the results usins Assert
        assertEquals(expectedResult, result, 0);
        
    }

    /** ============================================================
     * Tests of classifyTumor method 
     *  ============================================================ 
     */
    @Test
    public void testClassifyTumor() {
        System.out.println("classifyTumor");
        // Arrange -- set up things for the test
        double radius = 0.1;
        double concavity = 0.1;
        String expResult = "Benign";
        
        // Act -- run the method to be tested
        String result = Unit14_CancerScreening.classifyTumor(radius, concavity);
        
        // Assert -- check the results usins Assert
        assertEquals(expResult, result);
    }
    
}
