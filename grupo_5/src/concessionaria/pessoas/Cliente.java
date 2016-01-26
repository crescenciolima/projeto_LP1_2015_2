package concessionaria.pessoas;

public class Cliente extends Pessoa {
	public Cliente(String nome, String endereco, String rg, String cpf, String nascimento) {
		super(nome, endereco, rg, cpf, nascimento);
                System.out.println("Cliente: " + nome + " cadastrado com sucesso.");
	}
}
