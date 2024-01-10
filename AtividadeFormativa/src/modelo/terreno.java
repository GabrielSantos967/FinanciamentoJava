package modelo;

public class terreno extends Financiamento {

	public terreno(double valorImovel, int prazoAnos, double taxa) {
		super(valorImovel, prazoAnos, taxa);}
		
		@Override
		public void pagamentoMensal() {
			double valorImovel = this.getValorImovel();
	        int prazoAnos = this.getPrazoAnos();
	        double taxa = this.getTaxa();
	        double taxaMensal = taxa/100/12;
	        int numeroParcelas = prazoAnos*12;
	        
	        double totalMensal = (valorImovel / numeroParcelas) * (1 + (taxaMensal));
	        double totalTerreno = totalMensal * 1.02;
	        
	        System.out.println("o total do terreno: R$ " + totalTerreno);
		}
		
		public void zona(String zona) {
			System.out.println("Vai ser em uma zona " + zona);
		}
	
}
