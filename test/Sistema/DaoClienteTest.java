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
public class DaoClienteTest {
    
    public DaoClienteTest() {
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
     * Test of getLista method, of class DaoCliente.
     */
    @Test
    public void testGetLista() {
        System.out.println("getLista");
        DaoCliente instance = new DaoCliente();
        List<Cliente> expResult = null;
        List<Cliente> result = instance.getLista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of salvarCliente method, of class DaoCliente.
     */
    @Test
    public void testSalvarCliente() {
        System.out.println("salvarCliente");
        Cliente obj = null;
        DaoCliente instance = new DaoCliente();
        instance.salvarCliente(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of excluirCliente method, of class DaoCliente.
     */
    @Test
    public void testExcluirCliente() {
        System.out.println("excluirCliente");
        int codigo = 0;
        DaoCliente instance = new DaoCliente();
        instance.excluirCliente(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of alteraCliente method, of class DaoCliente.
     */
    @Test
    public void testAlteraCliente() {
        System.out.println("alteraCliente");
        int codigo = 0;
        DaoCliente instance = new DaoCliente();
        instance.alteraCliente(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
