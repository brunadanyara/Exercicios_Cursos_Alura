
public class CriaConta {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 200;
		System.out.println("primeira conta tem " + primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println("valor total primeira conta" + primeiraConta.saldo);
//criando segunda conta		
		Conta segundaConta=new Conta();
		segundaConta.saldo = 50;
		System.out.println("segunda conta tem " + segundaConta.saldo);
		
		
	}
}
