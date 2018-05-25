/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sistema;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


/**
 *
 * @author adm
 */
public class Importa {
   
    
    public void importaCliente() {
        
        {
            
        
        File arquivo = new File("C:\\Users\\itach\\Desktop\\CadastroCliente.txt");
      try{
       System.lineSeparator(); // para poder usar \r junto com \n e pular linha na gravacao do txt     
      
        Scanner scanner = new Scanner(arquivo);
          
           
            while(scanner.hasNextLine()) {
                String s[];
               
                s =(scanner.nextLine().split(";"));
            
                
           
            
                DaoCliente dao = new DaoCliente();
                      
                      
                    if(s.length==7){
                        PessoaJuridica obj = new PessoaJuridica();
                        int codigo=Integer.parseInt(s[0]);
                        obj.setCodigo(codigo);
                        obj.setNome(s[1]);
                        obj.setEndereco(s[2]);
                        obj.setTelefone(s[3]);
                        obj.setTipo(s[4]);
                        obj.setCnpj(s[5]);
                        int ie=Integer.parseInt(s[6]);
                        obj.setIe(ie);
                             
                             
                             
                         
                     if(!obj.getTipo().equalsIgnoreCase("J")){
                            System.out.println("Tipo do cliente nº:"+codigo+" invalido");
                            
                          
                     }
                     else
                     {
                         dao.salvarCliente(obj);
                     }
                      
                    } 
                    else if(s.length==6) {
                        PessoaFisica obj = new PessoaFisica();
                        int codigo=Integer.parseInt(s[0]);
                        obj.setCodigo(codigo);
                        obj.setNome(s[1]);
                        obj.setEndereco(s[2]);
                        obj.setTelefone(s[3]);
                        obj.setTipo(s[4]);
                        obj.setCpf(s[5]);
                       
                       
                         if(!obj.getTipo().equalsIgnoreCase("F")){
                            System.out.println("Tipo do cliente nº:"+codigo+" invalido");
                           
                           
                        }
                         else
                         {
                              dao.salvarCliente(obj);
                         }
                       
                      
                    }
                    
                
                
            
           
      }
           System.out.println(Dados.listaClientes); 
                       
      }
      catch(Exception e){
          System.out.println("excessao"+e);
      }
        
    }
                  
    }
            

    
    public void importaCompra() {
        
    
  File arquivo = new File("C:\\Users\\itach\\Desktop\\RegistroCompras.txt");

 
     
     try{
  
       System.lineSeparator(); 
        
        
        Scanner  scanner = new Scanner(arquivo);
       
        DaoCompras dao = new DaoCompras();
      while(scanner.hasNextLine()) 
        while(scanner.hasNextLine()){
            
            String s[];
            
            
            s=(scanner.nextLine()).split(";");
           
             int codigoF=Integer.parseInt(s[1]);
             int codigoP= Integer.parseInt(s[3]);
             
            Compra obj = new Compra();
            
            
            int numeronf = Integer.parseInt(s[0]);
            obj.setNotaFiscal(numeronf);
          
           
            Fornecedor f = Busca.buscarFornecedor(codigoF);
            
                if (f != null){ 
                    obj.setFornecedor(f);
                }
                
                else{ 
                    System.out.println(
                             "Fornecedor nao existe na Compra nº: "
                            +obj.getNotaFiscal()+" ");
                    break;
                }

                Produto p = Busca.buscarProduto(codigoP);
                
                if(p != null){
                    obj.setProduto(p);
                }
                else
                {
                   System.out.println("Produto nao existe na Compra nº: "+" "
                            +obj.getNotaFiscal()+" ");
                    break;
                }
                
                obj.setData(s[2]);
                
                 int quantidade=Integer.parseInt(s[4]);
            
                 obj.setQuantidade(quantidade);
            
                 dao.NovaCompra(obj);
            
                 
            
            }
        System.out.println(Dados.listaCompras);
        }
     catch(Exception e ){
         System.out.println("excessao: "+e);
     }
 }
       

    
    public void importaFornecedor(){
    
{
        
        File arquivo = new File("C:\\Users\\itach\\Desktop\\CadastroFornecedor.txt");
        DaoFornecedor dao = new DaoFornecedor();
       
            try{
                System.lineSeparator(); 
            Scanner scanner = new Scanner(arquivo);
            
            while(scanner.hasNextLine()){
                String s[];
                
                s=(scanner.nextLine().split(";"));
                Fornecedor obj = new Fornecedor();
                int codigo = Integer.parseInt(s[0]);
                obj.setCodigo(codigo);
                obj.setNome(s[1]);
                obj.setEndereco(s[2]);
                obj.setTelefone(s[3]);
                obj.setCnpj(s[4]);
                obj.setContato(s[5]);
                dao.SalvarFornecedor(obj);
            }
           
                System.out.println(Dados.listaFornecedores);
            
        }
            catch(Exception e){
                System.out.println("excessao: "+ e);
            }
       
    }

}
    
    public void importaProduto() {
        
    
      
     File arquivo = new File("C:\\Users\\itach\\Desktop\\CadastroProduto.txt");
     DaoProduto dao = new DaoProduto();
     try { 
         System.lineSeparator(); 
         Scanner scanner = new Scanner(arquivo);
         while(scanner.hasNextLine()){
             
             String s[];
         s=(scanner.nextLine().split(";"));
         
         Produto obj= new Produto();
      
         int codigo=Integer.parseInt(s[0]);
         obj.setCodigo(codigo);
         obj.setDesc(s[1]);
         int qtdeMin=Integer.parseInt(s[2]);
         obj.setEstoqueMinimo(qtdeMin);
         int qtdeAt=Integer.parseInt(s[3]);
         obj.setQuantidadeEstoque(qtdeAt);
         int custo=Integer.parseInt(s[4]);
         obj.setCusto(custo);
         int pct = Integer.parseInt(s[5]);
         obj.setPercentualLucro(pct);
         
         dao.SalvarProduto(obj);

         }
         
         System.out.println(Dados.listaProdutos);
     }
     
     catch(Exception e ){
         
     }
      
      
  }
    
    public void ImportaVenda() {
        
    System.lineSeparator(); 

        DaoVendas dao= new DaoVendas();
        
        File arquivo = new File("C:\\Users\\itach\\Desktop\\RelatorioVendas.txt");
        
     
       
        try {
        
            Scanner scann = new Scanner(arquivo);
            
            
            
            while(scann.hasNextLine()){
            while(scann.hasNextLine()){
                Venda obj = new Venda();
                String s [];
                s=(scann.nextLine().split(";"));
               
                Integer id =Dados.listaVendas.size()+1;
                int codigoC = Integer.parseInt(s[0]);
                Cliente c = Busca.buscarClienteVenda(codigoC);
                  if(c!=null){
                      obj.setCliente(c);
                  }
                
                   obj.setData(s[1]);
                   obj.setId(id);
               
                
                    int codigoP=Integer.parseInt(s[2]);
                    Produto p = Busca.buscarProduto(codigoP);
                    if(p !=null){
                        obj.setProduto(p);
                        
                    }
                    else
                    {
                        System.out.println("Produto nº:"+codigoP+" nao existe");
                        break;
                    }
                    
                    int qtde=Integer.parseInt(s[3]);
                    obj.setQuantidade(qtde);
                
                    obj.setMeioPagamento(s[4]);
                    if(obj.getMeioPagamento().equalsIgnoreCase("P")){
                        if(c.getCodigo()!=0) {
                            dao.NovaVenda(obj);
                             break;
                            
                        }
                        else{
                            System.out.println("Cliente nulo nao cadastrado para venda P");
                            break;
                        }
                  
                    }
                    else{
                        dao.NovaVenda(obj);
                             break;
                        
                    }
                  
                 }
               
        }
           
        
       
  
}
        catch(Exception e){
            System.out.println("Excessao: "+e);
        }
}
}

