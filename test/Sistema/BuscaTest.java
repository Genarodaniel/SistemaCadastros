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
public class BuscaTest {
    
    public BuscaTest() {
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
     * Test of buscarFornecedor method, of class Busca.
     */
    @Test
    public void testBuscarFornecedor() {
        System.out.println("buscarFornecedor");
        int codigo = 0;
        Fornecedor expResult = null;
        Fornecedor result = Busca.buscarFornecedor(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarCompraDeProdutosPorFornecedor method, of class Busca.
     */
    @Test
    public void testBuscarCompraDeProdutosPorFornecedor() {
        System.out.println("buscarCompraDeProdutosPorFornecedor");
        int codigo = 0;
        List<Compra> expResult = null;
        List<Compra> result = Busca.buscarCompraDeProdutosPorFornecedor(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcularTotalAPagarFornecedor method, of class Busca.
     */
    @Test
    public void testCalcularTotalAPagar() {
        System.out.println("calcularTotalAPagar");
        Fornecedor obj = null;
        double expResult = 0.0;
        double result = Busca.calcularTotalAPagarFornecedor(obj);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarProduto method, of class Busca.
     */
    @Test
    public void testBuscarProduto() {
        System.out.println("buscarProduto");
        int codigo = 0;
        Produto expResult = null;
        Produto result = Busca.buscarProduto(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarClienteVenda method, of class Busca.
     */
    @Test
    public void testBuscarClienteVenda() {
        System.out.println("buscarClienteVenda");
        int codigo = 0;
        Cliente expResult = null;
        Cliente result = Busca.buscarClienteVenda(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarCliente method, of class Busca.
     */
    @Test
    public void testBuscarCliente() {
        System.out.println("buscarCliente");
        int codigo = 0;
        Cliente expResult = null;
        Cliente result = Busca.buscarCliente(codigo);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarCompra method, of class Busca.
     */
    @Test
    public void testBuscarCompra() {
        System.out.println("buscarCompra");
        int nota = 0;
        Compra expResult = null;
        Compra result = Busca.buscarCompra(nota);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
