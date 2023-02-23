
public class testaGetESet {
	
	public static void main(String[] args) {
		Conta conta = new Conta(123, 123);
		conta.setNumero(123);
		System.out.println(conta.getNumero());
	
		Cliente paulo = new Cliente();
		paulo.setNome("paulo silveira");
		
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		
	}

		
}

