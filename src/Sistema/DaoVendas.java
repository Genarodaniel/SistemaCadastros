/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import java.io.File;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author adm
 */
public class DaoVendas {
    
    
    public void NovaVenda(Venda obj){
        Iterator it =Dados.listaProdutos.iterator();
        while(it.hasNext()){
            Produto e = (Produto) it.next();
            
            Integer codigo=Dados.listaVendas.size()+1;
            obj.setId(codigo);
            {
                
                if(obj.getQuantidade()>e.getQuantidadeEstoque()){
                    System.out.println("Quantidade indisponivel");
                    break;
                }
                else
                {
                    e.setQuantidadeEstoque(e.getQuantidadeEstoque()-obj.getQuantidade());
                    Dados.listaVendas.add(obj);
                    System.out.println("Venda nº: "+codigo+" feita com sucesso");
                    break;
                }
              
      }
            
        
        }
       
    }

  
    public void AlteraVenda(int id){
        Scanner scanner = new Scanner(System.in);
        
      Iterator it =Dados.listaVendas.iterator();
      for(Venda p : Dados.listaVendas){
        while(it.hasNext()){
            
            
        p.setId(id);
          if(Dados.listaVendas.contains(p))
          {
             if(!p.getMeioPagamento().equalsIgnoreCase("P")){
              System.out.println("Digite cliente");
              int codigo =scanner.nextInt();
             
              Cliente c =Busca.buscarCliente(codigo);
              
              if(c != null){
                  p.setCliente(c);
              }
              else
              {
                  System.out.println("Cliente nao existe");
                  break;
              }
             }
              System.out.println("Digite a data");
              
              p.setData(scanner.next());
              
              
              System.out.println("Digite o produto ");
              int codigoP = scanner.nextInt();
              Produto e = Busca.buscarProduto(codigoP);
              
              if(e!=null){
                  p.setProduto(e);
              }
              else{
                  System.out.println("Produto nº"+codigoP +" Nao existe!");
                  break;
              }
              System.out.println("Digite a quantidade : ");
              p.setQuantidade(scanner.nextInt());
    break;
          }
                
        }
        System.out.println(Dados.listaVendas);   
    }
    }
    
    public void removeConta(int id){
        
        for (Venda e : Dados.listaVendas) {
            e.setId(id);
            if(Dados.listaVendas.contains(e)){
                Dados.listaVendas.remove(e);   
            }
            else
                System.out.println("Impossivel remover Venda nº: "+id +", nao existe");
        }
        
    }
    
    
    
}
