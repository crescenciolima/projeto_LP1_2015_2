
package LP1;

public class RepositorioFunci{
    
    private PessoaAbstrato [] funcionarios ;
    private int IndiceF;
    private final static int MAX = 100;
    
    //construtor
    public RepositorioFunci(){
        IndiceF = 0;       
        funcionarios = new PessoaAbstrato[MAX];
    }
    
    
    //cadastrar Funcionario
    public void cadastrar(PessoaAbstrato cadastro){
        funcionarios[IndiceF] = cadastro;
        IndiceF++;
    
    }
  //imprimir Quadro de Funcionarios
    public void imprimirFuncionarios(){  
        for(int i=0; i<=IndiceF-1;i++){
            System.out.println("-----------------------------------------------");
            System.out.println("Codigo: " + funcionarios[i].getCodigo());
            System.out.println("Nome: " + funcionarios[i].getNome());
            System.out.println("CPF: " + funcionarios[i].getCpf());
            System.out.println("-----------------------------------------------");
        }   
    }
    
    
       
    
    //removerfuncionario
    public void removercadastro(String nome){
        
        for(int i=0;i<=IndiceF;i++){
            if(funcionarios[i].getNome().equals(nome)){
                break;
            }   
            funcionarios[i] = funcionarios[IndiceF-1];
            funcionarios[IndiceF-1] = null;
            IndiceF--;
        }
    }
    
    //procurar funcionario
    public int procurarFuncionario(String nome){
        int i;
        for(i=0; i<IndiceF; i++){
            if (funcionarios[i].getNome().equals(nome)){
                break;
            }
            
        }
        return i;
    }
    
    
    
    //
    //
    //
    public void removerFF(int cod){
        int temp = procurarCodigo(cod);
        funcionarios[temp] = funcionarios[IndiceF-1];
            funcionarios[IndiceF-1] = null;
            IndiceF--;
    }
    

    //função procurar exemplar a partir do codigo e retorna o indice do array
    //PODEMOS CRIAR METODOS DE PROCURA ATRAVES DO NOME TIPO, QQER COISA
    public int procurarCodigo(int cod){
        int temp=0;
        for(int i=0; i<IndiceF; i++){
            if (funcionarios[i].getCodigo()== cod){
                temp = i;
                break;
            }
        }
        if (temp>IndiceF)
            System.out.println("Funcionario não existe.");
            
        return temp;
    }
    
    
    
    
    
    
    
    
}
