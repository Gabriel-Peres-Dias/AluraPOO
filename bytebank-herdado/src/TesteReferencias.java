
public class TesteReferencias {

	public static void main(String[] args) {
		
		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
	
		EditorVideo ev = new EditorVideo();
		ev.setSalario(2500.0);
		

		Designer d = new Designer();
		d.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(d);

		EditorVideo e1 = new EditorVideo();
		e1.setSalario(2500);
		
		Designer d1 = new Designer();
		g1.setSalario(2000);

		controle.registra(d1);
		
		System.out.println(controle.getSoma());
		
	}

}
