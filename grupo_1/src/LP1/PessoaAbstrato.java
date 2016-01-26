
package LP1;

public abstract class PessoaAbstrato {
    private int Codigo;
    private String Tipo;
    private String Nome;
    private String Cpf;
    
    
    //construtor
    public PessoaAbstrato(int codigo, String Tipo, String nome, String cpf){
        this.Codigo = codigo;
        this.Tipo = Tipo;
        this.Nome = nome;
        this.Cpf = cpf;
    }
    
    
    //sets e gets
    public int getCodigo() {
        return Codigo;
    }
    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }
    public String getTipo() {
        return Tipo;
    }
    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String Nome) {
        this.Nome = Nome;
    }
    public String getCpf() {
        return Cpf;
    }
    public void setCpf(String Cpf) {
        this.Cpf = Cpf;
    }

}
