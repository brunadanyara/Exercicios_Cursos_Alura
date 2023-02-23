//Extends = Gerente e um Funcionario, Gerente herda da class Funcionario
public class EditorVideo extends Funcionario  {

		public double getBonificacao() {
			System.out.println("chamando o método de bonificacao do EDITOR");
			return super.getBonificacao() + 100;
		}

}
