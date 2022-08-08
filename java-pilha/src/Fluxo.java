public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        	metodo1();
        	} catch(Exception ex) {
            String mensagemDeErro = ex.getMessage();
          	System.out.println("Exception " + mensagemDeErro);
          	ex.printStackTrace();
        	}
        
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaException {
        System.out.println("Ini do metodo1");
        	metodo2();
        System.out.println("Fim do metodo1");
    }
 // O compilador verifica minha excessao quando extendo o Exception
    private static void metodo2() throws MinhaException {
        System.out.println("Ini do metodo2");
        // O compilador não verifica minha excessao quando extendo o RunTimeException
        throw new MinhaException("Deu pau");
        //System.out.println("Fim do metodo2");
    }
}