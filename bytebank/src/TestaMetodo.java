
public class TestaMetodo {
	
	public static void main(String[] args) {
		//metodo deposita
		Conta contadoPaulo = new Conta();
		contadoPaulo.saldo = 100;
		
		contadoPaulo.deposita(50);   
		System.out.println("deposita " + contadoPaulo.saldo);
		
		//metodo saca
		boolean conseguiuRetirar = contadoPaulo.saca(20);
		System.out.println("saldo após sacar " + contadoPaulo.saldo);
		System.out.println("retorno logico " + conseguiuRetirar);
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		
		contaDaMarcela.transfere(300, contadoPaulo);
		System.out.println(contaDaMarcela.saldo);
		
		contadoPaulo.titular = "paulo silveira" ;
		System.out.println(contadoPaulo.titular);
	}

}
