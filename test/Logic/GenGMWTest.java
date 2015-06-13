/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

import java.util.ArrayList;
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
public class GenGMWTest {
    
    public GenGMWTest() {
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

    /**
     * Test of getListGMW method, of class GenGMW.
     */
//    @Test
//    public void testGetListGMW() {
//        System.out.println("getListGMW");
//        int[] ruleSwap = null;
//        List baseSeq = null;
//        GenGMW instance = new GenGMW();
//        List expResult = null;
//        List result = instance.getListGMW(ruleSwap, baseSeq);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getMatx method, of class GenGMW.
     */
//    @Test
//    public void testGetMatx() {
//        System.out.println("getMatx");
//        List list = null;
//        GenGMW instance = new GenGMW();
//        int[][] expResult = null;
//        int[][] result = instance.getMatx(list);
//        assertArrayEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of getStringFromMatx method, of class GenGMW.
     */
    @Test
    public void testGetStringFromMatx() {
        System.out.println("getStringFromMatx");
        int[][] mas = {{1,0,2},{2,4,5}};
        GenGMW instance = new GenGMW();
        int[] expResult = {1,0,2,2,4,5};
        int[] result = instance.getStringFromMatx(mas);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
       @Test
    public void testGetStringFromMatx_2() {
        System.out.println("getStringFromMatx");
        int[][] mas = {{1,0,2},{2,4,5},{8,9,7}};
        GenGMW instance = new GenGMW();
        int[] expResult = {1,0,2,2,4,5,8,9,7};
        int[] result = instance.getStringFromMatx(mas);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of getListGMW method, of class GenGMW.
     */
//    @Test
//    public void testGetListGMW() {
//        System.out.println("getListGMW");
//         int [] base = {0,0,1,1,1,0,1}; 
//       int[] rule = {-1, 6,0,0,3,2,0,2};
//       List<int[]> listBaseSeq = new ArrayList<>();
//       listBaseSeq.add(base);
//        List baseSeq = listBaseSeq;
//        GenGMW instance = new GenGMW();
//        List expResult = null;
//        List result = instance.getListGMW(rule, baseSeq);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    
}
