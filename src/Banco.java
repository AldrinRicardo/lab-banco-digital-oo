import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas = new ArrayList<>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
	public void adicionarConta(Conta c) {
		contas.add(c);
	}
	
	public void listarClientes() {
		System.out.printf("Lista de clientes do banco %s: %n", this.nome);
		for (Conta c : contas) {
			System.out.println(c.getCliente());
		}
	}
	
}
