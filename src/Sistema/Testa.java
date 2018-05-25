/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import java.io.FileNotFoundException;
import java.util.List;



/**
 *
 * @author adm
 */
public class Testa {
        public static void main(String[] args) {
            {
                {
           
       /*   ################# Lista de Metodos disponiveis #####################    
           
           ###################### Classe busca   ################## - 

        --    buscarFornecedor(int codigo) -  percorre a lista e Retorna o fornecedor com aquele codigo

        --    buscarProduto(int codigo) - percorre a lista e  Retorna o produto com aquele codigo

        --    buscarCliente(int codigo)  -- Percore a lista e retorna o cliente com aquele codigo 

        --    buscarCompra(int nota) - Percorre a lista e retorna a compra com aquela nota fiscal

        --    buscarClienteVenda(int codigo) -- método feito especificamente para retornar um cliente com codigo 0
              para as Vendas a vista sem cliente declaro. 

        --    buscarCompraDeProdutosPorFornecedor(int codigo) - Adiciona em um array local as compras do fornecedor
              e retorna esse array

        --    buscarVendaDeProdutosPorCliente(Cliente obj) - Adiciona em um array local as vendas para o cliente
              e retorna esse array

        --   calcularTotalAPagarFornecedor(Fornecedor obj)  -- recebe um fornecedor como parametro e calcula o total a 
             pagar de suas contas

        --   calcularTotalAPagarCliente(Cliente obj) -- recebe um Cliente como parametro e calcula o total a 
             pagar de suas contas
        

                #################### Classe  Dao(Data acess object) Cliente ################## #
                    
                    
        --salvarCliente(Cliente obj)-  recebe cliente como parametro verifica se ja existe pelo contains, e senao existir
          salva na lista de cadastro de clientes
                    
        -- excluirCliente(int codigo) - recebe codigo do cliente como parametro e verifica se o cliente existe, se existir
           remove da lista.
        
        -- alteraCliente(int codigo) -- recebe codigo do cliente como parametro, itera a lista e verifica se o cliete existe
           se o mesmo existir, usando o scanner atribui os atributos alterados ao cliente selecionado.
        
        
                    
                   #################### Classe  Dao(Data acess object) Compras ###################
                    
        -- public void NovaCompra(Compra obj)-  recebe objeto Compra como parametro, itera a lista e  verifica se ja existe
          pelo equals(nota fiscal), e senao existir adiciona a compra e soma a quantidade do produto comprado ao estoque,
          e salva na lista de Compras.
                    
        -- excluirCompra(int nota) - recebe a nota fiscal da compra como parametro e verifica se a compra existe, se existir
           remove da lista.
        
        -- alteraCompra(int nota) -- recebe a nota da compra como parametro, itera a lista e verifica se a compra existe
           se a mesma existir, usando o scanner atribui os atributos alterados a compra selecionada.
                    
                    
                   #################### Classe  Dao(Data acess object) Fornecedor ###################
                    
                    
           --salvarFornecedor(Fornecedor obj)-  recebe o fornecedor como parametro e verifica se ja existe pelo contains, e senao existir
          salva na lista de cadastro de fornecedores
                    
        -- excluirFornecedor(int codigo) - recebe codigo do fornecedor como parametro e verifica se o fornecedor existe, se existir
           remove da lista.
        
        -- alteraFornecedor(int codigo) -- recebe codigo do fornecedor como parametro, itera a lista e verifica se o fornecedor existe
           se o mesmo existir, usando o scanner atribui os atributos alterados ao fornecedor selecionado.
        
        
                     #################### Classe  Dao(Data acess object) Produto ###################
                    
        --salvarProduto(Produto obj)-  recebe o produto como parametro e verifica se ja existe pelo contains, e senao existir
          salva na lista de cadastro de produtos
                    
        -- excluirProduto(int codigo) - recebe codigo do produto como parametro e verifica se o mesmo existe, se existir
           remove da lista.
        
        -- EditarProduto(int codigo) -- recebe codigo do produto como parametro, itera a lista e verifica se o mesmo existe
           se  existir, usando o scanner atribui os atributos alterados ao produto selecionado.


                    #################### Classe  Dao(Data acess object) Vendas ###################  
         
        -- NovaVenda(Venda obj) - recebe uma venda como parametro, atribui a ela o id de tamanho size +1, ou seja 
           o id sempre sera crescente com o numero de vendas, verifica se há quantidade disponivel no estoque para
           aquela venda, se nao tiver  cancela. se tiver adiciona na lista de vendas.
                    
        --AlteraVenda(int id) - recebe o id da venda como parametro, itera a lista de vendas e se existir a venda 
          atribui aos seus atributos os dados capturados pelo scanner.a mesma verifica se o novo cliente que sera colocado
          existe e tambem se o novo produto existe.
                    
        -- removeConta(int id) - verifica na lista se exisste pelo contains e se existir remove da lista . 
                    
                    ############################Classe Importa ######################
                    
        -- importaCliente() - cria um ponteiro para o txt dos cadastros de cliente, le o arquivo e atribui os dados lidos a um obj
           e adiciona na lista a cada vez que o while passa por uma linha do txt. o metodo tambem verifica o tipo digitado
           se e valido ou nao. A validacao de pessoa fisica ou juridica acontece atraves do tamanho do vetor de string salva
           por linha . 
                    
        -- importaFornecedor() - cria um ponteiro para o txt dos cadastros de fornecedores, le o arquivo e atribui os dados lidos a um obj
           e adiciona na lista a cada vez que o while passa por uma linha do txt. 
                    
        -- importaCompra() - cria um ponteiro para o txt das compras , le o arquivo e atribui os dados lidos a cada ; a uma compra 
           tambem faz a verificacão da existencia de fornecedor e produto . 
            
        -- importaProduto() - cria um ponteiro para o txt dos cadastros de produtos, le o arquivo e atribui os dados lidos separados
                    por ";" a um obj, e adiciona na lista a cada vez que o while passa por uma linha do txt.
                    
        -- importa Venda () - cria um ponteiro para o txt de vendas, le as vendas separadas por ";", atribui cada atributo
           lido a seu respectivo atributo do novo objeto. tambem faz a verificacao se o cliente existe
            e se tiver com o  codigo 0(codigo para venda a vista) verifica se a venda e diferente de P, pois
            o cliente 0 é apenas para vendas a vista.
                    
            ############################ Classe Relatorio #########################
                    
    --   relatorioFornecedor(List<Fornecedor> list) - recebe como parametro a lista de fornecedores (Dados.listaFornecedores)
         passa um for each pegando o codigo de cada fornecedor, e a cada vez que ele pega o codigo do fornecedor
         instancia um novo objeto vazio da classe ContaApagar, para receber aquela divida, a variavel total recebe 
         o double retornado pelo metodo calcularTotalAPagarFornecedor(f) / f= fornecedor. 
         atribui o fornecedor ao objeto instanciado e o total para total a pagar, e adiciona na lista de contasApagar
         Depois itera a lista de contasApagar gravando os arquivos no txt  pelo printstream - que grava objetos.
       
         relatorioCliente(List<Cliente> list) - recebe como parametro a lista de clientes (Dados.listaClientes)
         passa um for each pegando o codigo de cada cliente, e a cada vez que ele pega o codigo do cliente
         instancia um novo objeto vazio da classe ContaAreceber, para receber aquela divida, a variavel total recebe 
         o double retornado pelo metodo calcularTotalAPagarCliente(c) / c= cliente. 
         atribui o cliente ao objeto instanciado e o total para total a pagar, e adiciona na lista de contasAreceber
         Depois itera a lista de contasApagar gravando os arquivos no txt  pelo printstream - que grava objetos.
                    
                    
  */                  
                    
                Relatorio re=new Relatorio();
                DaoCliente dao = new DaoCliente();
                DaoFornecedor dao1 = new DaoFornecedor();
                DaoProduto dao2;
                dao2 = new DaoProduto();
                DaoCompras dao3;
                dao3=new DaoCompras();
                 Importa imp=new Importa();
                DaoVendas dao4 = new DaoVendas();
                
                    imp.importaCliente();
                    imp.importaFornecedor();
                    imp.importaProduto();
                    imp.ImportaVenda();
                    imp.importaCompra();
                    re.relatorioProduto(Dados.listaProdutos);
                   
                    
                    
                    
                   
                   
                    
        }  
            }}}


   

