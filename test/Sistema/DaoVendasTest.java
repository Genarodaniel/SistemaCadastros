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
public class DaoVendasTest {
    
    public DaoVendasTest() {
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
     * Test of NovaVenda method, of class DaoVendas.
     */
    @Test
    public void testNovaVenda() {
        System.out.println("NovaVenda");
        Venda obj = null;
        DaoVendas instance = new DaoVendas();
        instance.NovaVenda(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AlteraVenda method, of class DaoVendas.
     */
    @Test
    public void testAlteraVenda() {
        System.out.println("AlteraVenda");
        int id = 0;
        DaoVendas instance = new DaoVendas();
        instance.AlteraVenda(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeConta method, of class DaoVendas.
     */
    @Test
    public void testRemoveConta() {
        System.out.println("removeConta");
        int id = 0;
        DaoVendas instance = new DaoVendas();
        instance.removeConta(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
