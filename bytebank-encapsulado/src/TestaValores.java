
public class TestaValores {
//utilizando construtor	
	public static void main(String[] args) {
		Conta conta = new Conta (123,123);
		System.out.println(conta.getAgencia());
		
		conta.setAgencia(123123);
		
		Conta conta2 = new Conta(1337, 161616);
		Conta conta3 = new Conta(1338, 161617);
		
		System.out.println(Conta.getTotal());
	}

}
