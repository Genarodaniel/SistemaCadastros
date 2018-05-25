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
public class Busca {
    
    public static Fornecedor buscarFornecedor(int codigo) {
        
        for(Fornecedor f: Dados.listaFornecedores){
            
            
             if(f.getCodigo() == codigo){
                     return f;
         }
       }
            return null; 
     }
   
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
    
    public  static double calcularTotalAPagarFornecedor(Fornecedor obj) {
  double total = 0;

 
  for(Compra cp: (buscarCompraDeProdutosPorFornecedor(obj.getCodigo()))) {
    
         total += cp.getTotalApagar();
 
  }
  
  return total;
}
    
  
     public  static double calcularTotalAPagarCliente(Cliente obj) {
  double total = 0;

 
  for(Venda c1: (buscarVendaDeProdutosPorCliente(obj.getCodigo()))) {
    
         total += c1.getValoraPagar();
 
  }
  
  return total;
}
      
    
    
    
    
    public static Produto buscarProduto(int codigo){
        for (Produto p : Dados.listaProdutos){
            if(p.getCodigo() == codigo)
            {
                return p;
            }    
        }
        return null;
    }
   
            
    
    public static  Cliente buscarClienteVenda(int codigo){
        Iterator it=Dados.listaClientes.iterator();
        Cliente c1 = new Cliente();
        c1.setCodigo(codigo);
        while(it.hasNext()){
           if(Dados.listaClientes.contains(c1)){
                return c1; 
            }
            else
            {
                c1.setCodigo(0);
                return c1;
            }
        }
        
        
     
    

        return null ;
    }
    
    
    public static  Cliente buscarCliente(int codigo){
        Iterator it=Dados.listaClientes.iterator();
        Cliente c1 = new Cliente();
        c1.setCodigo(codigo);
        while(it.hasNext()){
           if(Dados.listaClientes.contains(c1)){
                return c1; 
            }
            else
            {
                
                return null;
            }
        }
     
    

        return null ;
    }
    
    
    
     public static  Compra buscarCompra(int nota){
        Iterator it=Dados.listaCompras.iterator();
        Compra c1 = new Compra();
        c1.setNotaFiscal(nota);
        while(it.hasNext()){
           if(Dados.listaCompras.contains(c1)){
                return c1; 
            }
            else
            {
                
                return null;
            }
        }
     
    

        return null ;
    }
    
    
    
    
}
