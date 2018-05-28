/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import static Sistema.Dados.listaCompras;
import static Sistema.Dados.listaVendas;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author adm
 */

// Classe contendo os metodos de seleção e busca nos arraylists do programa.


public class Busca {
    
    
    //Percorre a lista de Fornecedores em busca do código passado como parâmetro,
    // retorna o fornecedor encontrado com aquele código como parâmetro
    
    public static Fornecedor buscarFornecedor(int codigo) {
        
        for(Fornecedor f: Dados.listaFornecedores){
            
            
             if(f.getCodigo() == codigo){
                     return f;
         }
       }
            return null; 
     }
    
    /* Recebe como parametro uma String representando o meio de pagamento, cria um arrayList de vendas
    local chamado resultado, percorre a lista de vendas e busca pelo meio de pagamento das vendas 
    uma String igual a passada como parametro e adiciona no arrayList resultado. depois retorna
    o array com todas as vendas feitas com aquele meio de pagamento
    */
    public static List<Venda> buscarVendaPorPagamento(String meio){
        List <Venda> resultado =new ArrayList<>();
        
        for(Venda e : Dados.listaVendas){
            if(!e.getMeioPagamento().equalsIgnoreCase(meio)){
                
            }else{resultado.add(e);
            } 
        }
        
        return resultado;
        
    }
    
    /* Recebe como parâmetro um inteiro denominado codigo que representa o código do fornecedor,
    percorre a lista de compras comparando o código do fornecedor com o código passado como parâmetro,
    se o código for igual,adiciona na lista local aquela compra.
    o método retorna uma lista denominada resultado com as compras do fornecedor como codigo passado.
    
   */
    public static List<Compra> buscarCompraDeProdutosPorFornecedor(int codigo) {
   List<Compra> resultado = new ArrayList<>();
  for(Compra cp: listaCompras) {
    if (cp.getFornecedor().getCodigo() != codigo) {
      } else {
        resultado.add(cp);
      }
        
  }
  return resultado;
}
    
    /* Recebe como parâmetro um inteiro denominado codigo que representa o código do produto,
    percorre a lista de compras comparando o código do Produto com o código passado como parâmetro,
    se o código for igual,adiciona na lista local aquela compra.
    o método retorna uma lista denominada resultado com as compras com o produto de codigo igual
    o passado como parametro.
    
   */
    
    public static List<Compra> buscarCompraDeProdutosPorCodigo(int codigo){
        List<Compra> resultado = new ArrayList<>();
        for(Compra cp: listaCompras)
        {
            if(cp.getProduto().getCodigo() !=codigo){
                }else{
                resultado.add(cp);
            }
            
        }
    return resultado;
    
    }
    
     /* Recebe como parâmetro um inteiro denominado codigo que representa o código do produto,
    percorre a lista de vendas comparando o código do Produto com o código passado como parâmetro,
    se o código for igual,adiciona na lista local aquela venda.
    o método retorna uma lista denominada resultado com as vendas com o produto de codigo
    igual o passado como parametro.
    
   */
    
 public static List<Venda> buscarVendaDeProdutosPorCodigo(int codigo) {
   List<Venda> resultado = new ArrayList<>();
  for(Venda c: listaVendas) {
    if (c.getProduto().getCodigo() != codigo) {
      } else {
        resultado.add(c);
      }
        
  }
  return resultado;
}
    
 /* método busca e adiciona vendas pelo meio de pagamento.
 
 */
 public static void buscaVendasMeio(){
     String meio;
         String meioConvertido = null;
     // percorre a lista
        for (Venda c : Dados.listaVendas) {
           // cada vez que passa pela lista pega o meio de pagamento
            meio=c.getMeioPagamento();
            // lista recebe o array que é retornado pelo metodo buscarVendaPorPagamento com o parametro meio 
            List <Venda> lista =Busca.buscarVendaPorPagamento(meio);
            
            // tratando os caracteres possiveis para melhor vizualização no tostring da classe.
            if(meio.equalsIgnoreCase("C")){
                meioConvertido = "Cartão de Crédito"; // transforma c em Cartao de credito
            }else
            if(meio.equalsIgnoreCase("P")){
                meioConvertido ="Pagamento posterior"; // transforma P em pagamento posterior
            }else
                
            if(meio.equalsIgnoreCase("$")){
                meioConvertido ="Dinheiro"; // transforma $ em Dinheiro
            }else
             if(meio.equalsIgnoreCase("X")){
                meioConvertido ="Cheque"; // transforma x em cheque
             }else
            if(meio.equalsIgnoreCase("D")){
                meioConvertido="Cartão de Débito";// transforma D em débito
            }else
            if(meio.equalsIgnoreCase("T")){
                 meioConvertido = "Ticket"; // transforma T em ticket 
            }
        
            // instancia um novo objeto com o metodo de pagamento e a lista de vendas
            BalancoMP o = new BalancoMP(meioConvertido,lista);
            // e no fim adiciona esse objeto com o metodo addMP
            addMP(o);
        }
        System.out.println(Dados.listaVendasMP);
            
           
     
 }
    
    /* recebe como parametro um objeto do tipo BalancoMP(usado no relatorio)
    percorre o array do relatorío de vendas por meio de pagamento e verifica usando contains se ja existe
     o objeto, se não existir o adiciona */
    
 public static void addMP(BalancoMP obj){
     if(!Dados.listaVendasMP.contains(obj)){
         Dados.listaVendasMP.add(obj);
     }
    
 }
  /*metodo de busca de vendas usado para buscar vendas
  e gerar uma lista com as vendas por produto e lucro
   */
    
    public static void buscaVendas(){
         int codigo;
         double total=0;
        // declara o iterator que ira percorre a lista
         Iterator it =Dados.listaProdutos.iterator();
        // percorre a lista de produtos
       while(it.hasNext()){
           Produto c =(Produto) it.next();
           // a cada vez que é executado a variavel local codigo recebe o codigo do produto.
           codigo=c.getCodigo();
           // chama o metodo de busca das vendas do produto com o codigo que cada vez representa um produto da lista
           List <Venda> lista =Busca.buscarVendaDeProdutosPorCodigo(codigo);
           /* atribui a variavel local o resultado do metodo calcularLucro que recebe como parametro as vendas
           que foram atribuidas a lista acima  */
           
           total=calcularLucro(lista);
           /* instancia um novo objeto do tipo BalancoProdutos (usado no relatório) e atribui a ele o produto
            as vendas para aquele produto, e o lucro total daquelas vendas */
           BalancoProdutos o = new BalancoProdutos();
           o.setProduto(c);
           o.setList(lista);
           o.setLucro(total);
           // adiciona no array VendasProdutos que é usado exclusivamente para o relatório.
           Dados.listaVendasProdutos.add(o);    
       }
    }
    
     /* Recebe como parâmetro um inteiro denominado codigo que representa o código do Cliente,
    percorre a lista de vendas comparando o código do Cliente com o código passado como parâmetro,
    se o código for igual,adiciona na lista local aquela venda.
    o método retorna uma lista denominada resultado com as vendas para o cliente do codigo 
    passado como parametro.
    
   */
    public static List<Venda> buscarVendaDeProdutosPorCliente(int codigo) {
    List<Venda> resultado = new ArrayList<>();
    for(Venda c: listaVendas) {
    if (c.getCliente().getCodigo() != codigo) {
      } else {
        resultado.add(c);
      }
        
  }
  return resultado;
}
    
    // método para calcular o total a pagar por fornecedor;
    // recebe como parametro um objeto do tipo funcionario
    public  static double calcularTotalAPagarFornecedor(Fornecedor obj) {
  double total = 0;

 // percorre a lista de compras por fornecedor que o metodo buscarCompraDeProdutosPorFornecedor retorna 
  for(Compra cp: (buscarCompraDeProdutosPorFornecedor(obj.getCodigo()))) {
    
      // acumula os valores do total a pagar a cada compra
         total += cp.getTotalApagar();
 
  }
  // retorna o total a pagar
  return total;
}
    
    // método para calcular lucro de vendas, recebe como parametro uma lista de vendas 
    public static double calcularLucro(List <Venda> list){
        double total = 0;
        // percorre a lista 
        for(Venda e : list){
            // recebetoda vez que e percorrido o lucro de uma venda, dado pelo preco de venda - preco de custo
            // vezes a quantidade
            total += (e.getProduto().getPrecoVenda()-e.getProduto().getCusto())*e.getQuantidade();
        }
        // retorna o lucro total daquela lista de vendas
        return total;
    }
    
  // recebe como parametro um objeto tipo cliente, e calcula o total a pagar desse cliente
     public  static double calcularTotalAPagarCliente(Cliente obj) {
        double total = 0;
         // percorre a lista de vendas para aquele cliente
             for(Venda c1: (buscarVendaDeProdutosPorCliente(obj.getCodigo()))) {
                 // verifica se foi uma venda de pagamento posterior(divida).
                    if(c1.getMeioPagamento().equalsIgnoreCase("P")){
                        // a cada vez que anda na lista o total recebe acumulando o valor a pagar
                            total += c1.getValoraPagar();
    }
  }
  // retorna o total a pagar por cliente
  return total;
}
      
// buscao um produto através do codigo passado como parametro
    public static Produto buscarProduto(int codigo){
        // percorre a lista de produto e verifica se o codigo e igual o passado como parametro
        
        for (Produto p : Dados.listaProdutos){
            if(p.getCodigo() == codigo)
            {
                // retorna o objeto se o codigo coincidir
                return p;
            }    
        }
        // retorna nulo se o objeto nao existir na lista
        return null;
    }

    // método de busca de clientes usado exclusivamente para as vendas 
    public static  Cliente buscarClienteVenda(int codigo){
        Iterator it=Dados.listaClientes.iterator();
        Cliente c1 = new Cliente(); // instancia um novo objeto do tipo cliente
        c1.setCodigo(codigo); // seta o codigo do novo cliente com o codigo passado como parametro
        while(it.hasNext()){ // percorre a lista de clientes
           if(Dados.listaClientes.contains(c1)){
                return c1; // se existir na lista retorna o objeto
            }
            else
            {
                c1.setCodigo(0); // se nao existir o novo objeto fica com codigo 0( cliente a vista)
                                 // assim todas as vendas para cliente 0 foram a vista.
                return c1;// retorna o cliente com o codigo 0;
            }
        }
   
        return null ;
    }
    
    
// busca de clientes usado para todas as buscas de clientes exceto venda.
    public static  Cliente buscarCliente(int codigo){ // recebe como parametro o codigo do cliente
        Iterator it=Dados.listaClientes.iterator();
        Cliente c1 = new Cliente(); // instancia um novo objeto do tipo cliente
        c1.setCodigo(codigo); // seta o codigo do novo cliente com o codigo passado como parametro
        while(it.hasNext()){ // percorre a lista
           if(Dados.listaClientes.contains(c1)){
                return c1; // se existir  retorna o objeto
            }
            else
            {
                
                return null; // se nao existir retorna nuo
            }
        }
     
    

        return null ;
    }
    // busca uma compra na lista de compra através do numero da nota fiscal passado como parâmetro.
     public static  Compra buscarCompra(int nota){
        Iterator it=Dados.listaCompras.iterator();
        Compra c1 = new Compra();// instancia uma nova compra
        c1.setNotaFiscal(nota);// seta a nota fiscal com a passada como parametro a esse novo objeto
        while(it.hasNext()){// percorre a lista
           if(Dados.listaCompras.contains(c1)){ // verifica se existe o objeto usando contains(equals)
                return c1; // retorna o objeto se o mesmo existir
            }
            else
            {
                
                return null; // se nao existir retorna nulo
            }
        }
     
    

        return null ;
    }
    
    
    
    
}
