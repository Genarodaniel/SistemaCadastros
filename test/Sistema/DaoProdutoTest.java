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
public class DaoProdutoTest {
    
    public DaoProdutoTest() {
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
     * Test of getLista method, of class DaoProduto.
     */
    @Test
    public void testGetLista() {
        System.out.println("getLista");
        DaoProduto instance = new DaoProduto();
        List<Produto> expResult = null;
        List<Produto> result = instance.getLista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of SalvarProduto method, of class DaoProduto.
     */
    @Test
    public void testSalvarProduto() {
        System.out.println("SalvarProduto");
        Produto obj = null;
        DaoProduto instance = new DaoProduto();
        instance.SalvarProduto(obj);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of ExcluirProduto method, of class DaoProduto.
     */
    @Test
    public void testExcluirProduto() {
        System.out.println("ExcluirProduto");
        int codigo = 0;
        DaoProduto instance = new DaoProduto();
        instance.ExcluirProduto(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of EditarProduto method, of class DaoProduto.
     */
    @Test
    public void testEditarProduto() {
        System.out.println("EditarProduto");
        int codigo = 0;
        DaoProduto instance = new DaoProduto();
        instance.EditarProduto(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
