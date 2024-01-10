package modelo;

public class apartamento extends Financiamento {
	public apartamento(double valorImovel, int prazoAnos, double taxa) {
		super(valorImovel, prazoAnos, taxa);}
	
	@Override
	 public void pagamentoMensal() {
    	double valorImovel = this.getValorImovel();
        int prazoAnos = this.getPrazoAnos();
        double taxa = this.getTaxa();
        double taxaMensal = taxa/100/12;
        int numeroParcelas = prazoAnos*12;
        
        double totalApartamento = ((valorImovel * taxaMensal) * Math.pow((1 + taxaMensal), numeroParcelas)) / (Math.pow((1 + taxaMensal), numeroParcelas)-1);
        System.out.println("O total do apartamento : R$ " + totalApartamento + "\n");
	
	}
	
	public void atributos(int vagas, int andar) {
		System.out.println("O numero do andar é: " + andar);
		System.out.println("A quantidade de vagas é: " + vagas);
	}
}
