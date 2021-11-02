/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Simon James Puttock
 */
public class LargestTest {
    
    public LargestTest() {
    }
    
    @BeforeAll
    public static void setUpClass () throws Exception {
    }
    
    @AfterAll
    public static void tearDownClass () throws Exception {
    }
    
    @Test
    public void testOrder () {
        assertEquals (9, Largest.largest (new int[] {8 ,9 ,7}));
        assertEquals (9, Largest.largest (new int [] {8 ,9 ,7}));
        assertEquals (9, Largest.largest (new int [] {7 ,8 ,9}));
    }
    
    @Test
    public void testEmpty () {
        try {
            Largest.largest(new int [] {});
            fail (" Should have thrown an exception ");
        } catch (RuntimeException e) {
            assertTrue ( true );
        }
    }
    
    @Test
    public void testOne () {
        assertEquals (1, Largest.largest ( new int [] {1}));
    }
    
    @Test
    public void testNegative (){
        int [] negList = new int [] {-9, -8, -7};
        assertEquals (-7, Largest.largest(negList));
    }
}
