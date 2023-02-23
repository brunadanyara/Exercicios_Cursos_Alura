
public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try { 
        metodo1();
        } catch(ArithmeticException | NullPointerException | MinhaExecao ex) {
        	String msg = ex.getMessage();
        	System.out.println("Exception" + msg);
        	ex.printStackTrace();
        }
        	System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();  
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        
        throw new MinhaExecao("deu muito errado");
//        for(int i = 1; i <= 5; i++) {
  //          System.out.println(i);
//           int a =i / 0;
//            
//           Conta c = null;
//           c.deposita();
            
        }      
       
}
//
//public class Principal {
//
//    public static void main(String[] args) {
//
//        String nome = "Alura";
//        System.out.println("ANTES");
//
//        try {
//            System.out.println(nome);
//        } catch(ArrayIndexOutOfBoundsException ex) {
//            System.out.println("CATCH");
//        }
//
//        System.out.println("DEPOIS");
//    }
//}


