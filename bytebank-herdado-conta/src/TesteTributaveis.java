
public class TesteTributaveis {

	public static void main(String[] args) {

	ContaCorrente cc = new ContaCorrente(222, 333);
	cc.deposita(100.0);
	
	
	SeguroDeVida sv = new SeguroDeVida();
	
	CalculadorDeImposto ci = new CalculadorDeImposto();
	ci.registra(sv);
	ci.registra(cc);
	
	System.out.println(ci.getValorImposto());
			
	
	}

}
