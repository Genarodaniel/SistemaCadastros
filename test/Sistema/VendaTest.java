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
public class VendaTest {
    
    public VendaTest() {
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
     * Test of getCliente method, of class Venda.
     */
    @Test
    public void testGetCliente() {
        System.out.println("getCliente");
        Venda instance = new Venda();
        Cliente expResult = null;
        Cliente result = instance.getCliente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCliente method, of class Venda.
     */
    @Test
    public void testSetCliente() {
        System.out.println("setCliente");
        Cliente cliente = null;
        Venda instance = new Venda();
        instance.setCliente(cliente);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getData method, of class Venda.
     */
    @Test
    public void testGetData() {
        System.out.println("getData");
        Venda instance = new Venda();
        String expResult = "";
        String result = instance.getData();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getId method, of class Venda.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Venda instance = new Venda();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Venda.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Venda instance = new Venda();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setData method, of class Venda.
     */
    @Test
    public void testSetData() {
        System.out.println("setData");
        String data = "";
        Venda instance = new Venda();
        instance.setData(data);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProduto method, of class Venda.
     */
    @Test
    public void testGetProduto() {
        System.out.println("getProduto");
        Venda instance = new Venda();
        Produto expResult = null;
        Produto result = instance.getProduto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProduto method, of class Venda.
     */
    @Test
    public void testSetProduto() {
        System.out.println("setProduto");
        Produto produto = null;
        Venda instance = new Venda();
        instance.setProduto(produto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantidade method, of class Venda.
     */
    @Test
    public void testGetQuantidade() {
        System.out.println("getQuantidade");
        Venda instance = new Venda();
        int expResult = 0;
        int result = instance.getQuantidade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantidade method, of class Venda.
     */
    @Test
    public void testSetQuantidade() {
        System.out.println("setQuantidade");
        int quantidade = 0;
        Venda instance = new Venda();
        instance.setQuantidade(quantidade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMeioPagamento method, of class Venda.
     */
    @Test
    public void testGetMeioPagamento() {
        System.out.println("getMeioPagamento");
        Venda instance = new Venda();
        String expResult = "";
        String result = instance.getMeioPagamento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMeioPagamento method, of class Venda.
     */
    @Test
    public void testSetMeioPagamento() {
        System.out.println("setMeioPagamento");
        String meioPagamento = "";
        Venda instance = new Venda();
        instance.setMeioPagamento(meioPagamento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValoraPagar method, of class Venda.
     */
    @Test
    public void testGetValoraPagar() {
        System.out.println("getValoraPagar");
        Venda instance = new Venda();
        double expResult = 0.0;
        double result = instance.getValoraPagar();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValoraPagar method, of class Venda.
     */
    @Test
    public void testSetValoraPagar() {
        System.out.println("setValoraPagar");
        Double valoraPagar = null;
        Venda instance = new Venda();
        instance.setValoraPagar(valoraPagar);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Venda.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Venda instance = new Venda();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Venda.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Venda instance = new Venda();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Venda.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Venda instance = new Venda();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
