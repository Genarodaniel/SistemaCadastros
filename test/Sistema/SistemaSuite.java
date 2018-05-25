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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author adm
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({Sistema.DaoProdutoTest.class, Sistema.PessoaFisicaTest.class, Sistema.ClienteTest.class, Sistema.ContaApagarTest.class, Sistema.DaoVendasTest.class, Sistema.DaoComprasTest.class, Sistema.CompraTest.class, Sistema.PessoaJuridicaTest.class, Sistema.DaoClienteTest.class, Sistema.TestaTest.class, Sistema.DaoFornecedorTest.class, Sistema.BuscaTest.class, Sistema.ProdutoTest.class, Sistema.ImportaTest.class, Sistema.DadosTest.class, Sistema.RelatorioTest.class, Sistema.VendaTest.class, Sistema.FornecedorTest.class})
public class SistemaSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
