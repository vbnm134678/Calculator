package gcukakao.jenkins.calculator; 
import org.junit.Test;

import gcukakao.jenkins.calculator.Calculator;

import static org.junit.Assert.assertEquals; 
 
public class CalculatorTest { 
     private Calculator calculator = new Calculator(); 
 
     @Test 
     public void testSum() { 
          assertEquals(5, calculator.sum(2, 3)); 
     } 
     @Test 
     public void testSub() { 
          assertEquals(5, calculator.sum(3, 2)); 
     } 
     @Test 
     public void testMul() { 
          assertEquals(10, calculator.sum(2, 5)); 
     } 
     @Test 
     public void testDiv() { 
          assertEquals(6, calculator.sum(12, 2)); 
     } 
} 
