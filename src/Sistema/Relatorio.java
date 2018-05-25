/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;
/**
 *
 * @author adm
 */


public class Relatorio {
    
    
    
    public List <Compra> getLista(){
        return Dados.listaCompras;
}
    
    
    
    public void relatorioFornecedor(List<Fornecedor> list){
         double total;
         int codigo;
         
       for(Fornecedor f :Dados.listaFornecedores){
           codigo=f.getCodigo();
           ContaApagar obj  = new ContaApagar();
             total = Busca.calcularTotalAPagarFornecedor(f);
             obj.setFornecedor(f);
             obj.setTotalApagar(total);
             Dados.listaContasApagar.add(obj);
       }
            Iterator it = Dados.listaContasApagar.iterator();
            while(it.hasNext()){
            ContaApagar x = (ContaApagar) it.next();
            try{ 
             FileOutputStream fos = new FileOutputStream("C:\\Users\\itach\\Desktop\\Relatorios\\RelatorioFornecedor.txt",true);
           PrintStream dos = new PrintStream(fos);
        
            dos.println(x);
            
            dos.flush();
       
       
    }
           
    
               catch(Exception e){
                 System.out.println("Excessao : ");
             }
             
       }
    
       
    }  
   
    
    public void relatorioProduto(List<Produto> list){
        
        
        Busca.buscaVendas();
        Iterator it = Dados.listaVendasProdutos.iterator();
       
            
            try{
                System.lineSeparator(); 
                FileOutputStream fos = new FileOutputStream("C:\\Users\\itach\\Desktop\\Relatorios\\RelatorioProduto.txt");
                PrintStream dos = new PrintStream(fos);
               while(it.hasNext()){ 
                dos.println(it.next());
               }
                
            }
            catch(Exception e){
                System.out.println("Excessao : "+e);
            }
        }
        
        
       
    
    
  
    public void relatorioCliente(List<Cliente> list){
         double total;
         int codigo=0;
         
       for(Cliente c :Dados.listaClientes){
           codigo=c.getCodigo();
           ContaAreceber obj  = new ContaAreceber();
      
             
             
             total = Busca.calcularTotalAPagarCliente(c);
             
             
             obj.setCliente(c);
             obj.setValoraPagar(total);
             Dados.listaContasAreceber.add(obj);
       }
            Iterator it = Dados.listaContasAreceber.iterator();
            while(it.hasNext()){
            ContaAreceber x = (ContaAreceber) it.next();
            try{ 
                System.lineSeparator(); 
             FileOutputStream fos = new FileOutputStream("C:\\Users\\itach\\Desktop\\Relatorios\\RelatorioClientes.txt",true);
           PrintStream dos = new PrintStream(fos);
        
            dos.println(x);
            
            dos.flush();
       
       
    }
           
    
               catch(Exception e){
                 System.out.println("Excessao : ");
             }
             
       }
    
       
    }  

    public void  GeraRelatorioEstoque(List<Produto> list) {

        
        Iterator ite = Dados.listaProdutos.iterator();
       while(ite.hasNext()) {
       
       for(Produto cp:Dados.listaProdutos ) {
           BalancoEstoque b = new BalancoEstoque();
        b.setProduto(cp);
        b.setEstoqueAtual(cp.getQuantidadeEstoque());
        b.setEstoqueMinimo1(cp.getEstoqueMinimo());
       Dados.listaEstoque.add(b);
        
       }
       
     
       
        Iterator it = Dados.listaEstoque.iterator();
            
     
            try{ 
                while(it.hasNext()){
            BalancoEstoque p = (BalancoEstoque) it.next();
            System.lineSeparator(); 
            FileOutputStream fos = new FileOutputStream("C:\\Users\\itach\\Desktop\\Relatorios\\RelatorioEstoque.txt",true);
            PrintStream dos = new PrintStream(fos);
        
            dos.println(p);
            
            dos.flush();
       
                }
          break;
            }
            catch(Exception e ){
                System.out.println(e);
 }    
       }
            
            }
 
       
public void gravaClientes(List <Cliente> list){
    
     

    for(Cliente p : Dados.listaClientes){
         try 
        { 
         

           FileOutputStream fos = new FileOutputStream("C:\\Users\\itach\\Desktop\\ackup Dados\\Clientes.txt",true);
           PrintStream dos = new PrintStream(fos);
          
            dos.println(p);
            
            dos.flush();
            
            
            
            
        }
     
        catch(Exception e ){
            System.out.println("erro: " + e);
           
        }
    }

}

public void gravaProduto(List <Produto> list){

     for(Produto p : Dados.listaProdutos){
         try 
        { 
         

           FileOutputStream fos = new FileOutputStream("C:\\Users\\itach\\Desktop\\backup Dados\\Produtos.txt",true);
           PrintStream dos = new PrintStream(fos);
          
            dos.println(p);
            
            dos.flush();
            
            
            
            
        }
     
        catch(Exception e ){
            System.out.println("erro: " + e);
           
        }
    }
    
    
}

public void gravaFornecedor(List <Fornecedor> list){

     for(Fornecedor f: Dados.listaFornecedores){
         try 
        { 
         

           FileOutputStream fos = new FileOutputStream("C:\\Users\\itach\\Desktop\\backup Dados\\Fornecedores.txt",true);
           PrintStream dos = new PrintStream(fos);
          
            dos.println(f);
            
            dos.flush();
            
            
            
            
        }
     
        catch(Exception e ){
            System.out.println("erro: " + e);
           
        }
    }
    
    
}
public void gravaCompras(List <Compra> list){

     for(Compra p : Dados.listaCompras){
         try 
        { 
         

           FileOutputStream fos = new FileOutputStream("C:\\Users\\itach\\Desktop\\backup Dados\\Compras.txt",true);
           PrintStream dos = new PrintStream(fos);
          
            dos.println(p);
            
            dos.flush();
            
            
            
            
        }
     
        catch(Exception e ){
            System.out.println("erro: " + e);
           
        }
    }
    
}
public void gravaVendas(List <Venda> list){

     for(Venda p : Dados.listaVendas){
         try 
        { 
         

           FileOutputStream fos = new FileOutputStream("C:\\Users\\16120841\\Desktop\\Backup\\Vendas.txt",true);
           PrintStream dos = new PrintStream(fos);
          
            dos.println(p);
            
            dos.flush();
            
            
            
            
        }
     
        catch(Exception e ){
            System.out.println("erro: " + e);
           
        }
    }
    
    
}






}