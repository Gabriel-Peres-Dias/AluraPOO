
public class SistemaInterno {
	
	public int senha = 2222;

	public void autentica(Autenticavel funcionarioAutenticavel) {
		boolean autenticou = funcionarioAutenticavel.autentica(this.senha);
	   if(autenticou) {
		   System.out.println("Pode entrar no sistema.");
	   } else {
		   System.out.println("Não pode entrar no sistema");
	   }
	}
	
	
}
