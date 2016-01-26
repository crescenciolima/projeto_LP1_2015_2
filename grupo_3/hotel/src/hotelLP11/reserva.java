package hotelLP11;

/**
* Em orde Alfabética:	
* @author Eber, Edmundo, jorlan, Luan, Roberto 
*/


public class reserva {
    
	protected String nomeCliente;
    protected String cpf;
    protected hotel r;
    protected pousada p;

    //Criacao de 2 contrutores com recursividade
    //construtor para hotel
    
    public reserva(String nomeCliente, String cpf, hotel r) {
        setNomeCliente(nomeCliente);
        setCpf(cpf);
        setR(r);     
    }
    
    //construtor para pousada
    
    public reserva(String nomeCliente, String cpf, pousada p) {
        setNomeCliente(nomeCliente);
        setCpf(cpf);
        setP(p);
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public hotel getR() {
        return r;
    }

    public void setR(hotel r) {
        this.r = r;
    }

    public pousada getP() {
        return p;
    }

    public void setP(pousada p) {
        this.p = p;
    }
    

    
}

	
	
	

