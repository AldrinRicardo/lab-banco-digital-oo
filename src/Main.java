
public class Main {

	public static void main(String[] args) {
		
		Banco b = new Banco();
		b.setNome("Nubank");
		
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");
		Cliente jorge = new Cliente();
		jorge.setNome("Jorge");
		
		Conta cc = new ContaCorrente(b, venilton);
		Conta poupanca = new ContaPoupanca(b, venilton);
		Conta cc2 = new ContaCorrente(b, jorge);
		
		b.adicionarConta(cc);
		b.adicionarConta(poupanca);
		b.adicionarConta(cc2);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		cc2.depositar(200);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		cc2.imprimirExtrato();

		b.listarClientes();
		
	}

}
