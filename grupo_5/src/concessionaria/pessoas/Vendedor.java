package concessionaria.pessoas;

public class Vendedor extends Pessoa {
	private double salario;

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public Vendedor(String nome, String endereco, String rg, String cpf, String nascimento, double salario) {
		super(nome, endereco, rg, cpf, nascimento);
		this.salario = salario;
                System.out.println("Vendedor: " + nome + " cadastrado com sucesso.");
	}

}
