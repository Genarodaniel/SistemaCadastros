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
public class ProdutoTest {
    
    public ProdutoTest() {
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
     * Test of getCodigo method, of class Produto.
     */
    @Test
    public void testGetCodigo() {
        System.out.println("getCodigo");
        Produto instance = new Produto();
        int expResult = 0;
        int result = instance.getCodigo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCodigo method, of class Produto.
     */
    @Test
    public void testSetCodigo() {
        System.out.println("setCodigo");
        int codigo = 0;
        Produto instance = new Produto();
        instance.setCodigo(codigo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEstoqueMinimo method, of class Produto.
     */
    @Test
    public void testGetEstoqueMinimo() {
        System.out.println("getEstoqueMinimo");
        Produto instance = new Produto();
        int expResult = 0;
        int result = instance.getEstoqueMinimo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEstoqueMinimo method, of class Produto.
     */
    @Test
    public void testSetEstoqueMinimo() {
        System.out.println("setEstoqueMinimo");
        int estoqueMinimo = 0;
        Produto instance = new Produto();
        instance.setEstoqueMinimo(estoqueMinimo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantidadeEstoque method, of class Produto.
     */
    @Test
    public void testGetQuantidadeEstoque() {
        System.out.println("getQuantidadeEstoque");
        Produto instance = new Produto();
        int expResult = 0;
        int result = instance.getQuantidadeEstoque();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantidadeEstoque method, of class Produto.
     */
    @Test
    public void testSetQuantidadeEstoque() {
        System.out.println("setQuantidadeEstoque");
        int quantidadeEstoque = 0;
        Produto instance = new Produto();
        instance.setQuantidadeEstoque(quantidadeEstoque);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPercentualLucro method, of class Produto.
     */
    @Test
    public void testGetPercentualLucro() {
        System.out.println("getPercentualLucro");
        Produto instance = new Produto();
        int expResult = 0;
        int result = instance.getPercentualLucro();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPercentualLucro method, of class Produto.
     */
    @Test
    public void testSetPercentualLucro() {
        System.out.println("setPercentualLucro");
        int percentualLucro = 0;
        Produto instance = new Produto();
        instance.setPercentualLucro(percentualLucro);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCusto method, of class Produto.
     */
    @Test
    public void testGetCusto() {
        System.out.println("getCusto");
        Produto instance = new Produto();
        double expResult = 0.0;
        double result = instance.getCusto();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCusto method, of class Produto.
     */
    @Test
    public void testSetCusto() {
        System.out.println("setCusto");
        double custo = 0.0;
        Produto instance = new Produto();
        instance.setCusto(custo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDesc method, of class Produto.
     */
    @Test
    public void testGetDesc() {
        System.out.println("getDesc");
        Produto instance = new Produto();
        String expResult = "";
        String result = instance.getDesc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDesc method, of class Produto.
     */
    @Test
    public void testSetDesc() {
        System.out.println("setDesc");
        String desc = "";
        Produto instance = new Produto();
        instance.setDesc(desc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrecoVenda method, of class Produto.
     */
    @Test
    public void testGetPrecoVenda() {
        System.out.println("getPrecoVenda");
        Produto instance = new Produto();
        double expResult = 0.0;
        double result = instance.getPrecoVenda();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrecoVenda method, of class Produto.
     */
    @Test
    public void testSetPrecoVenda() {
        System.out.println("setPrecoVenda");
        double precoVenda = 0.0;
        Produto instance = new Produto();
        instance.setPrecoVenda(precoVenda);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Produto.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Produto instance = new Produto();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Produto.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Produto instance = new Produto();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Produto.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Produto instance = new Produto();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
