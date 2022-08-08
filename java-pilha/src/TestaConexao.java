
public class TestaConexao {

	public static void main(String[] args) {
		
		// isso tudo substitui tudo ali em baixo
		try(Conexao con = new Conexao() ) {
			con.leDados();
		} catch(IllegalStateException ex) {
			System.out.println("Deu ruim doidão");
		}
		
		
		
		
		
//			Conexao cnx = null;
//		try {
//			cnx = new Conexao();
//			cnx.leDados();
//		} catch (IllegalStateException ex) {
//			System.out.println("Deu ruim doidão");
//		} finally {
//			if(cnx != null) {
//				cnx.close();
//			}
//		}
	}

}
