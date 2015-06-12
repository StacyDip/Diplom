/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Stacy
 */
public class GeneratorMTest {
    
    public GeneratorMTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testShiftleft() {
        System.out.println("shiftleft");
        int[] mas = {1, 0, 0, 1, 0, 1};
        int[] expResult = {0, 0, 1, 0, 1, 1};
        int[] result = GeneratorM.shiftleft(mas);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }

    @Test
    public void testShiftleft2() {
        System.out.println("shiftleft");
        int[] mas = {1, 0, 0, 1, 0, 1, 1};
        int[] expResult = {0, 0, 1, 0, 1, 1, 1};
        int[] result = GeneratorM.shiftleft(mas);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        // fail("The test case is a prototype.");
    }



    /**
     * Test of gen_M method, of class Generator.
     */
    @Test 
    public void testGen_M() {
        System.out.println("gen_M");
        int length_M = 7;
        int[] polinom = {1,0,1};
        GeneratorM instance = new GeneratorM();
        int[] expResult = {1, 0, 0, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1};
        int[] result = instance.gen_M( polinom);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    
}
