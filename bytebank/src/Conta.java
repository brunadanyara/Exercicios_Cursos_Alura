class Conta {
	double saldo;
	int agencia ;
	int numero ;
	String titular;
	//atributos: saldo, agencia, numero, titular.

	//metodo depositar
	public void deposita(double valor) {
		this.saldo += valor;
	}
	//metodo saca
	public boolean saca(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
			
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
		}
	}
