
package LP1;

public class RepositorioClientes{
    
    private PessoaAbstrato [] clientes ;
    private int IndiceC;
    private final static int MAX = 100;
    
    //construtor
    public RepositorioClientes(){
        IndiceC = 0;       
        clientes = new PessoaAbstrato[MAX];
    }
    
    
    //cadastrar cliente
    public void cadastrar(PessoaAbstrato cadastro){
        clientes[IndiceC] = cadastro;
        IndiceC++;
    
    }
    //Listar clientes
    public void imprimirClientes(){  
        for(int i=0; i<=IndiceC-1;i++){
            System.out.println("-----------------------------------------------");
            System.out.println("Codigo: " + clientes[i].getCodigo());
            System.out.println("Nome: " + clientes[i].getNome());
            System.out.println("CPF: " + clientes[i].getCpf());
            System.out.println("-----------------------------------------------");
        }   
    }
    
    //removercliente
    public void removercadastro(int cod){
        for(int i=0;i<=IndiceC;i++){
            if(clientes[i].getCodigo() == (cod)){
                break;
            }   
            clientes[i] = clientes[IndiceC-1];
            clientes[IndiceC-1] = null;
            IndiceC--;
        }
    }
    
    //procurar cliente
    public int procurarCliente(String nome){
        int i;
        for(i=0; i<IndiceC; i++){
            if (clientes[i].getNome().equals(nome)){
                break;
            }
            
        }
        return i;
    }
    
    
    
    
    
    
    
    ///
    ///
    
    ///
    
    public void removerCC(int cod){
        int temp = procurarCodigo(cod);
        clientes[temp] = clientes[IndiceC-1];
            clientes[IndiceC-1] = null;
            IndiceC--;
    }
    

    //função procurar exemplar a partir do codigo e retorna o indice do array
    //PODEMOS CRIAR METODOS DE PROCURA ATRAVES DO NOME TIPO, QQER COISA
    public int procurarCodigo(int cod){
        int temp=0;
        for(int i=0; i<IndiceC; i++){
            if (clientes[i].getCodigo()== cod){
                temp = i;
                break;
            }
        }
        if (temp>IndiceC)
            System.out.println("Cliente não existe.");
            
        return temp;
    }
    
    
    
}
