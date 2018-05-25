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
public class CompraTest {
    
    public CompraTest() {
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
     * Test of getLista method, of class Compra.
     */
    @Test
    public void testGetLista() {
        System.out.println("getLista");
        Compra instance = new Compra();
        List<Produto> expResult = null;
        List<Produto> result = instance.getLista();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNotaFiscal method, of class Compra.
     */
    @Test
    public void testGetNotaFiscal() {
        System.out.println("getNotaFiscal");
        Compra instance = new Compra();
        int expResult = 0;
        int result = instance.getNotaFiscal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNotaFiscal method, of class Compra.
     */
    @Test
    public void testSetNotaFiscal() {
        System.out.println("setNotaFiscal");
        int notaFiscal = 0;
        Compra instance = new Compra();
        instance.setNotaFiscal(notaFiscal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getData method, of class Compra.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        Compra instance = new Compra();
        String expResult = "";
        String result = instance.getData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class Compra.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        String data = "";
        Compra instance = new Compra();
        instance.setData(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotalApagar method, of class Compra.
     */
    @Test
    public void testGetTotalApagar() {
        System.out.println("getTotalApagar");
        Compra instance = new Compra();
        double expResult = 0.0;
        double result = instance.getTotalApagar();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotalApagar method, of class Compra.
     */
    @Test
    public void testSetTotalApagar() {
        System.out.println("setTotalApagar");
        double totalApagar = 0.0;
        Compra instance = new Compra();
        instance.setTotalApagar(totalApagar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProduto method, of class Compra.
     */
    @Test
    public void testGetProduto() {
        System.out.println("getProduto");
        Compra instance = new Compra();
        Produto expResult = null;
        Produto result = instance.getProduto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProduto method, of class Compra.
     */
    @Test
    public void testSetProduto() {
        System.out.println("setProduto");
        Produto produto = null;
        Compra instance = new Compra();
        instance.setProduto(produto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFornecedor method, of class Compra.
     */
    @Test
    public void testGetFornecedor() {
        System.out.println("getFornecedor");
        Compra instance = new Compra();
        Fornecedor expResult = null;
        Fornecedor result = instance.getFornecedor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFornecedor method, of class Compra.
     */
    @Test
    public void testSetFornecedor() {
        System.out.println("setFornecedor");
        Fornecedor fornecedor = null;
        Compra instance = new Compra();
        instance.setFornecedor(fornecedor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantidade method, of class Compra.
     */
    @Test
    public void testGetQuantidade() {
        System.out.println("getQuantidade");
        Compra instance = new Compra();
        int expResult = 0;
        int result = instance.getQuantidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantidade method, of class Compra.
     */
    @Test
    public void testSetQuantidade() {
        System.out.println("setQuantidade");
        int quantidade = 0;
        Compra instance = new Compra();
        instance.setQuantidade(quantidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Compra.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Compra instance = new Compra();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Compra.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Compra instance = new Compra();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Compra.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Compra instance = new Compra();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
