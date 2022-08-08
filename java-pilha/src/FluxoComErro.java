public class FluxoComErro {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        	metodo1();
        	} catch(NullPointerException | ArithmeticException ex) {
            String mensagemDeErro = ex.getMessage();
          	System.out.println("Exception " + mensagemDeErro);
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
    	System.out.println("Loop Infinito");
        metodo2();
    }
}