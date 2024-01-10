package main;

//import modelo.Financiamento;
import util.InterfaceUsuario;
import modelo.casa;
import modelo.apartamento;
import modelo.terreno;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;


public class Main {

	public static void main(String[] args) {
		
		
		
		
		InterfaceUsuario interfaceUsuario = new InterfaceUsuario();
		
		double valor = interfaceUsuario.valor();
		double taxa = interfaceUsuario.taxa();		
		int prazo = interfaceUsuario.prazo();
		
		
		int escolha = interfaceUsuario.escolha();
		
		if (escolha == 1) {
			casa casa = new casa(valor, prazo, taxa);
			int tamanho = interfaceUsuario.terreno();
			int terreno = interfaceUsuario.tamanho();
			casa.atributos(tamanho,terreno);
			casa.pagamentoMensal();
		} else if (escolha == 2) {
			apartamento apartamento = new apartamento(valor, prazo, taxa);
			int vagas = interfaceUsuario.vaga();
			int andar = interfaceUsuario.andar();
			apartamento.atributos(vagas, andar);
			apartamento.pagamentoMensal();
		} else if (escolha == 3) {
			terreno terreno = new terreno(valor, prazo, taxa);
			String a1 = interfaceUsuario.zona();
			terreno.zona(a1);
			terreno.pagamentoMensal();
		}
		
		casa casa2 = new casa(800000, 20, 20);
		casa2.pagamentoMensal();
		
		casa casa3 = new casa(700000, 15, 15);
		casa3.pagamentoMensal();
		
		apartamento apartamento2 = new apartamento(500000, 40, 40);
		apartamento2.pagamentoMensal();
		
		apartamento apartamento3 = new apartamento(900000, 50, 20);
		apartamento3.pagamentoMensal();
		
		terreno terreno2 = new terreno(70000, 7, 5);
		terreno2.pagamentoMensal();
		
		//Financiamento financiamento = new Financiamento(valor, prazo, taxa);
		
		
		/*financiamento.pagamentoMensal();
		casa.pagamentoMensal();
		apartamento.pagamentoMensal();
		terreno.pagamentoMensal();*/
	}

}
