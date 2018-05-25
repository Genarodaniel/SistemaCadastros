/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import java.util.List;
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
public class DaoComprasTest {
    
    public DaoComprasTest() {
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
     * Test of getLista method, of class DaoCompras.
     */
    @Test
    public void testGetLista() {
        System.out.println("getLista");
        DaoCompras instance = new DaoCompras();
        List<Compra> expResult = null;
        List<Compra> result = instance.getLista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of NovaCompra method, of class DaoCompras.
     */
    @Test
    public void testNovaCompra() {
        System.out.println("NovaCompra");
        Compra obj = null;
        DaoCompras instance = new DaoCompras();
        instance.NovaCompra(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AlteraCompra method, of class DaoCompras.
     */
    @Test
    public void testAlteraCompra() {
        System.out.println("AlteraCompra");
        int nota = 0;
        DaoCompras instance = new DaoCompras();
        instance.AlteraCompra(nota);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RemoveCompra method, of class DaoCompras.
     */
    @Test
    public void testRemoveCompra() {
        System.out.println("RemoveCompra");
        int nota = 0;
        DaoCompras instance = new DaoCompras();
        instance.RemoveCompra(nota);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
