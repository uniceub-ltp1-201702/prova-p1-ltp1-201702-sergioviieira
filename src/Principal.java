
public class Principal {

	public static void main(String[] args) {
		BDSimulado bd = new BDSimulado();
		System.out.println(bd.getInfoCliente("Evandro da Silva"));
		System.out.println(bd.ligacoesPorCliente("Maria do Socorro"));
		
		int ligacoesPorUF = bd.ligacoesPorUF("DF");
		   System.out.println("Ligações feitas: " + ligacoesPorUF);
		
		   System.out.println("Ligações com UF de origem diferente com UF de destino: " + bd.ligacoesUFDiferente());
		   System.out.println("Conta Cliente: " + bd.contaCliente("José das Couves"));

	}

}
