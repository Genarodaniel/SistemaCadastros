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
public class PessoaJuridicaTest {
    
    public PessoaJuridicaTest() {
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
     * Test of getCnpj method, of class PessoaJuridica.
     */
    @Test
    public void testGetCnpj() {
        System.out.println("getCnpj");
        PessoaJuridica instance = new PessoaJuridica();
        String expResult = "";
        String result = instance.getCnpj();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCnpj method, of class PessoaJuridica.
     */
    @Test
    public void testSetCnpj() {
        System.out.println("setCnpj");
        String cnpj = "";
        PessoaJuridica instance = new PessoaJuridica();
        instance.setCnpj(cnpj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIe method, of class PessoaJuridica.
     */
    @Test
    public void testGetIe() {
        System.out.println("getIe");
        PessoaJuridica instance = new PessoaJuridica();
        int expResult = 0;
        int result = instance.getIe();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIe method, of class PessoaJuridica.
     */
    @Test
    public void testSetIe() {
        System.out.println("setIe");
        int ie = 0;
        PessoaJuridica instance = new PessoaJuridica();
        instance.setIe(ie);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class PessoaJuridica.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        PessoaJuridica instance = new PessoaJuridica();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class PessoaJuridica.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        PessoaJuridica instance = new PessoaJuridica();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
