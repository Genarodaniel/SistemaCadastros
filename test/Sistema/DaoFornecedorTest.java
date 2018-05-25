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
public class DaoFornecedorTest {
    
    public DaoFornecedorTest() {
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
     * Test of getLista method, of class DaoFornecedor.
     */
    @Test
    public void testGetLista() {
        System.out.println("getLista");
        DaoFornecedor instance = new DaoFornecedor();
        List<Fornecedor> expResult = null;
        List<Fornecedor> result = instance.getLista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SalvarFornecedor method, of class DaoFornecedor.
     */
    @Test
    public void testSalvarFornecedor() {
        System.out.println("SalvarFornecedor");
        Fornecedor obj = null;
        DaoFornecedor instance = new DaoFornecedor();
        instance.SalvarFornecedor(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ExcluirFornecedor method, of class DaoFornecedor.
     */
    @Test
    public void testExcluirFornecedor() {
        System.out.println("ExcluirFornecedor");
        int codigo = 0;
        DaoFornecedor instance = new DaoFornecedor();
        instance.ExcluirFornecedor(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EditarFornecedor method, of class DaoFornecedor.
     */
    @Test
    public void testEditarFornecedor() {
        System.out.println("EditarFornecedor");
        int codigo = 0;
        DaoFornecedor instance = new DaoFornecedor();
        instance.EditarFornecedor(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
