
package LP1;

public abstract class Produto {
   //ATRIBUTOS DA CLASSE
    private int codProduto;
    private String tipo;
    private String nomeProduto;
    private String marcaProduto;
    private double qtdEstoque;
    private double valor;  
   
    
    
    //CONSTRUTOR DA CLASSE
    public Produto(int codProduto, String tipo, String nomeProduto, String marcaProduto, double qtdEstoque, double valor){
        this.codProduto = codProduto;  
        this.tipo = tipo;
        this.nomeProduto = nomeProduto;
        this.marcaProduto = marcaProduto;
        this.qtdEstoque = qtdEstoque;
        this.valor  = valor;
    }
    
    
    //MÉTODOS GETS E SETS
    public int getCodProduto() {
        return codProduto;
    }
    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }
   public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }
    public String getMarcaProduto() {
        return marcaProduto;
    }
    public void setMarcaProduto(String marcaProduto) {
        this.marcaProduto = marcaProduto;
    }
    public double getQtdEstoque() {
        return qtdEstoque;
    }
    public void setQtdEstoque(double qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
