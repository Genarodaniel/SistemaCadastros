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
public class RelatorioTest {
    
    public RelatorioTest() {
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
     * Test of getLista method, of class Relatorio.
     */
    @Test
    public void testGetLista() {
        System.out.println("getLista");
        Relatorio instance = new Relatorio();
        List<Compra> expResult = null;
        List<Compra> result = instance.getLista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of relatorioFornecedor method, of class Relatorio.
     */
    @Test
    public void testRelatorioFornecedor() {
        System.out.println("relatorioFornecedor");
        List<Fornecedor> list = null;
        Relatorio instance = new Relatorio();
        instance.relatorioFornecedor(list);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gravaClientes method, of class Relatorio.
     */
    @Test
    public void testGravaClientes() {
        System.out.println("gravaClientes");
        List<Cliente> list = null;
        Relatorio instance = new Relatorio();
        instance.gravaClientes(list);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gravaProduto method, of class Relatorio.
     */
    @Test
    public void testGravaProduto() {
        System.out.println("gravaProduto");
        List<Produto> list = null;
        Relatorio instance = new Relatorio();
        instance.gravaProduto(list);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gravaFornecedor method, of class Relatorio.
     */
    @Test
    public void testGravaFornecedor() {
        System.out.println("gravaFornecedor");
        List<Fornecedor> list = null;
        Relatorio instance = new Relatorio();
        instance.gravaFornecedor(list);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gravaCompras method, of class Relatorio.
     */
    @Test
    public void testGravaCompras() {
        System.out.println("gravaCompras");
        List<Compra> list = null;
        Relatorio instance = new Relatorio();
        instance.gravaCompras(list);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of gravaVendas method, of class Relatorio.
     */
    @Test
    public void testGravaVendas() {
        System.out.println("gravaVendas");
        List<Venda> list = null;
        Relatorio instance = new Relatorio();
        instance.gravaVendas(list);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
