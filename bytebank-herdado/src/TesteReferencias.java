
public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Bruna");
		String nome = g1.getNome();
		g1.setSalario(5000.0);
		
		EditorVideo e = new EditorVideo();
		e.setSalario(2500.0);
		
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(e);
		
		System.out.println(controle.getSoma());
		
		
		
		
		
	}
}
