
package LP1;

import java.util.GregorianCalendar;

public class RepositorioProduto {
    
    private Produto [] estoque;
    private int indice;
    private final static int MAX = 100;
    
    //CONSTRUTOR
    public RepositorioProduto(){
        indice = 0;       
        estoque = new Produto[MAX];
    }
    
    
    public void inserir(Produto p){
       estoque[indice] = p;
       indice++;       
    }
    
    //funcão para excluir do array
    public void remover(int cod){
        int temp = procurarCodigo(cod);
        if(estoque[temp].getQtdEstoque() > 0){
            estoque[temp] = estoque[indice-1];
            estoque[indice-1] = null;
            indice--;
        }
        else
            System.out.println("Produto não pode ser excluído pois existe estoque do mesmo.");
    }
    

    //função procurar exemplar a partir do codigo e retorna o indice do array
    //PODEMOS CRIAR METODOS DE PROCURA ATRAVES DO NOME TIPO, QQER COISA
    public int procurarCodigo(int cod){
        int temp=0;
        for(int i=0; i<indice; i++){
            if (estoque[i].getCodProduto() == cod){
                temp = i;
                break;
            }
        }
        if (temp>indice)
            System.out.println("Produto não existe.");
            
        return temp;
    }
    
    public int procurarNome(String Nome){
        Nome = Nome.toUpperCase();
        int temp=0;
        for(int i=0; i<indice; i++){
            if (estoque[i].getNomeProduto().equals(Nome)){
                temp = i;
                break;
            }
        }
        if (temp>indice)
            System.out.println("Produto não existe.");
            
        return temp;
    }
    
    //imprimir Estoque
    public void imprimirEstoque(){ 
       for(int i=0; i<=indice-1;i++){
          System.out.println("-----------------------------------------------");
          System.out.println("Codigo: " + estoque[i].getCodProduto());
          System.out.println("Tipo: " + estoque[i].getTipo());
          System.out.println("Nome: " + estoque[i].getNomeProduto());
          System.out.println("Marca: " + estoque[i].getMarcaProduto());
          System.out.println("Quantidade em Estoque: " + estoque[i].getQtdEstoque());
          System.out.println("Valor de Venda: " + estoque[i].getValor()); 
          System.out.println("-----------------------------------------------");
                        
        }
    }
    
    
    //adicionar no estoque
	public void adicionarEstoque(String nome, double qtde){
        nome = nome.toUpperCase();
    	double qtdeTemp;
        
        for(int i=0; i<indice; i++){
            if (estoque[i].getNomeProduto().equals(nome)){
                qtdeTemp = qtde + estoque[i].getQtdEstoque();
                estoque[i].setQtdEstoque(qtdeTemp);
                break;
            }
        }

    }
    
    //venda
    public void Venda(String nomeProduto, double qtde, String NomeTemp){
        nomeProduto = nomeProduto.toUpperCase();
        NomeTemp = NomeTemp.toUpperCase();
        
        for(int i=0; i<indice; i++){
            if (estoque[i].getNomeProduto().equals(nomeProduto)){
              
                if (estoque[i].getQtdEstoque() >= qtde){
                    double qtdeTemp = estoque[i].getQtdEstoque() - qtde;
                    estoque[i].setQtdEstoque(qtdeTemp);
                        
                    //EXIBIÇÃO DO "EXTRATO DO CLIENTE"
                        double ValorTemp = obterValor(nomeProduto, qtde);
                        System.out.println("--------------------------------------------");
                        System.out.println("---------------CUPOM FISCAL-----------------");
                        System.out.println("--------------------------------------------");
                        //OBJETO CRIADO PARA MOSTRAR DATA E HORA ATUAL
                        GregorianCalendar gc = new GregorianCalendar();
                        System.out.println("DATA/HORA: "+gc.getTime());
                        System.out.println("--------------------------------------------");
                        System.out.println("\nCliente: " + NomeTemp);
                        System.out.println("------------DESCRIÇÃO PRODUTO---------------");
                        System.out.println("Produto: " + nomeProduto);
                        System.out.println("Quantidade: " + qtde+" Valor unidade: "+estoque[i].getValor());
                        System.out.println("--------------------------------------------");
                        System.out.println("Valor Total: " + ValorTemp);
                        System.out.println("--------------------------------------------");
                        System.out.println("----------OBRIGADO VOLTE SEMPRE!------------");
                    
                } 
                else{
                    System.out.println("Estoque insuficiente");
                break;
                }
                   
            }
            
        }
    }
    

    
    //obter o valor do produto
    public double obterValor(String nome, double qtde ){
        nome = nome.toUpperCase();
        double temp=0;
        for(int i=0; i<indice; i++){
            if (estoque[i].getNomeProduto().equals(nome)){
            	temp = qtde * estoque[i].getValor();
                break;
            }
        }
        return temp;
    }
    
    
    
    
    
    
}
