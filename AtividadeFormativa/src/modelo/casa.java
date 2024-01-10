package modelo;
public class casa extends Financiamento{

	public casa(double valorImovel, int prazoAnos, double taxa) {
		super(valorImovel, prazoAnos, taxa);}
		
		private int tamanho = 0;
		private int terreno = 0;	
		
	public int getTamanho() {
			return tamanho;
		}
		public void setTamanho(int tamanho) {
			this.tamanho = tamanho;
		}
		public int getTerreno() {
			return terreno;
		}
		public void setTerreno(int terreno) {
			this.terreno = terreno;
		}
		
	@Override
	    public void pagamentoMensal() {
	    	double valorImovel = this.getValorImovel();
	        int prazoAnos = this.getPrazoAnos();
	        double taxa = this.getTaxa();
	        double taxaMensal = taxa/100/12;
	        int numeroParcelas = prazoAnos*12;
	        
	        double totalCasa = (valorImovel / numeroParcelas) * (1 + (taxaMensal)) + 80;
	        System.out.println("O total da casa : R$ " + totalCasa + "\n");
		
	}
	    public void atributos(int tamanho2, int terreno2) {	    	
	    	System.out.println("O tamanho da área é: " + tamanho2);
	    	System.out.println("o tamanho do terreno é: " + terreno2);
	    }
	    
	
}
