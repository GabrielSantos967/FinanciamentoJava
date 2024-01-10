package modelo;


abstract class Financiamento {
	public double valorImovel;
	public int prazoAnos;
	public double taxa;
		
	public Financiamento(double valorImovel, int prazoAnos, double taxa) {
		super();
		this.valorImovel = valorImovel;
		this.prazoAnos = prazoAnos;
		this.taxa = taxa;
	}
	
	
	public double getValorImovel() {
		return this.valorImovel;
	}
	public void setValorImovel(double valorImovel) {
		this.valorImovel = valorImovel;
	}
	public int getPrazoAnos() {
		return this.prazoAnos;
	}
	public void setPrazoAnos(int prazoAnos) {
		this.prazoAnos = prazoAnos;
	}
	public double getTaxa() {
		return this.taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	
    public void pagamentoMensal() {
        double valorImovel = this.getValorImovel();
        int prazoAnos = this.getPrazoAnos();
        double taxa = this.getTaxa();
        double taxaMensal = taxa/100/12;
        
        double totalMensal = (valorImovel / prazoAnos) * (1+(taxaMensal/12));
        double totalImovel = totalMensal*prazoAnos;
        
        System.out.println("valor mensal R$ " + totalMensal);
        System.out.println("valor anual R$ " + totalImovel + "\n");
    }
}
