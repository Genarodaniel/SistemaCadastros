/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;
import java.util.*;
/**
 *
 * @author adm
 */
public class DaoCompras {
    public double custo2;
    
    public List <Compra> getLista(){
        return Dados.listaCompras;
    }
    
    Iterator iterator= Dados.listaProdutos.iterator();
    
    public void NovaCompra(Compra obj){
      double total;
while(iterator.hasNext()){
           Produto e =(Produto) iterator.next();
          
           if(obj.getProduto().equals(e))
           obj.getProduto().setQuantidadeEstoque(obj.getProduto().getQuantidadeEstoque()+obj.getQuantidade());
       }
                Dados.listaCompras.add(obj);
                System.out.println("Compra nº: "+obj.getNotaFiscal()+" adicionada ");
           
            
    }
    
    
   
  
    public void AlteraCompra(int nota){
        
      
        Iterator it = Dados.listaCompras.iterator();
         while(it.hasNext()){
                   Scanner scan = new Scanner(System.in);
                   while(it.hasNext()){
                   for(Compra lista : Dados.listaCompras)
                   if(nota== lista.getNotaFiscal())
                       {  System.out.println("Digite a nova nf : ");
                int codigoF = scan.nextInt();
                Fornecedor f = Busca.buscarFornecedor(codigoF);
                if(f!=null){
                    lista.setFornecedor(f);
                }
                else{
                    System.out.println("Fornecedor nº"+codigoF +" Nao existe!");
                    break;
                }
                System.out.println("Digite a data : ");
                lista.setData(scan.nextLine());
                System.out.println("Digite o codigo do produto");
                int codigoP= scan.nextInt();
                Produto p = Busca.buscarProduto(codigoP);
                if(p !=null){
                    lista.setProduto(p);
                }
                else
                {
                    System.out.println("Produto nº"+codigoP +" Nao existe!");
                    break;
                }
                System.out.println("Digite a quantidade: ");
                lista.setQuantidade(scan.nextInt());
                
        }
}
         }
         
    }
    
    
    public void RemoveCompra(int nota){
        
       Iterator it = Dados.listaCompras.iterator();
        while(it.hasNext()){
        for(Compra lista : Dados.listaCompras)
     if(nota== lista.getNotaFiscal()){
           Dados.listaCompras.remove(lista);
           System.out.println("Compra removida! ");
           break;
        }
       else
       {
           System.out.println("Compra nº: "+ nota+" nao existe !");
           break;
       }
       break;
    }
   
    
    
    
    
}
    }



    
    

