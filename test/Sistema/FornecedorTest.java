/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author adm
 */
public class FornecedorTest {
    
    public FornecedorTest() {
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
     * Test of getContato method, of class Fornecedor.
     */
    @Test
    public void testGetContato() {
        System.out.println("getContato");
        Fornecedor instance = new Fornecedor();
        String expResult = "";
        String result = instance.getContato();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setContato method, of class Fornecedor.
     */
    @Test
    public void testSetContato() {
        System.out.println("setContato");
        String contato = "";
        Fornecedor instance = new Fornecedor();
        instance.setContato(contato);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Fornecedor.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Fornecedor instance = new Fornecedor();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
