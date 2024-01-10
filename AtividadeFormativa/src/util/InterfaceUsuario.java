package util;

import java.util.Scanner;

public class InterfaceUsuario {
	
	
	Scanner p = new Scanner(System.in);
	
    public double taxa() {
        double valor;
        while (true) {
            try {
                System.out.println("Digite o valor da taxa: ");
                valor = p.nextDouble();
                if (valor >= 0) {
                    break; // Saia do loop se o valor for válido
                } else {
                    System.out.println("Por favor, digite um valor positivo.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número válido.");
                p.next(); // Limpar o buffer do Scanner
            }
        }
        return valor;
    }

    public double valor() {
        double valor;
        while (true) {
            try {
                System.out.println("Digite o valor do imóvel: ");
                valor = p.nextDouble();
                if (valor >= 0) {
                    break; // Saia do loop se o valor for válido
                } else {
                    System.out.println("Por favor, digite um valor positivo.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número válido.");
                p.next(); // Limpar o buffer do Scanner
            }
        }
        return valor;
    }

    public int prazo() {
        int valor;
        while (true) {
            try {
                System.out.println("Digite o prazo do financiamento em anos: ");
                valor = p.nextInt();
                if (valor >= 0) {
                    break; // Saia do loop se o valor for válido
                } else {
                    System.out.println("Por favor, digite um valor positivo.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número válido.");
                p.next(); // Limpar o buffer do Scanner
            }
        }
        return valor;
    }

    public int escolha() {
        int valor;
        while (true) {
            try {
                System.out.println("Qual o tipo de financiamento?");
                System.out.println("CASA(1)  APARTAMENTO(2)  TERRENO(3)");
                valor = p.nextInt();
                if (valor >= 1 && valor <= 3) {
                    break; // Saia do loop se o valor for válido
                } else {
                    System.out.println("Por favor, escolha uma opção válida.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número válido.");
                p.next(); // Limpar o buffer do Scanner
            }
        }
        return valor;
    }

    public int tamanho() {
        int valor;
        while (true) {
            try {
                System.out.println("Digite o tamanho da área construída: ");
                valor = p.nextInt();
                if (valor >= 0) {
                    break; // Saia do loop se o valor for válido
                } else {
                    System.out.println("Por favor, digite um valor positivo.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número válido.");
                p.next(); // Limpar o buffer do Scanner
            }
        }
        return valor;
    }

    public int terreno() {
        int valor;
        while (true) {
            try {
                System.out.println("Digite o tamanho do terreno: ");
                valor = p.nextInt();
                if (valor >= 0) {
                    break; // Saia do loop se o valor for válido
                } else {
                    System.out.println("Por favor, digite um valor positivo.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número válido.");
                p.next(); // Limpar o buffer do Scanner
            }
        }
        return valor;
    }

    public int andar() {
        int valor;
        while (true) {
            try {
                System.out.println("Digite o andar do apartamento: ");
                valor = p.nextInt();
                if (valor >= 0) {
                    break; // Saia do loop se o valor for válido
                } else {
                    System.out.println("Por favor, digite um valor positivo.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número válido.");
                p.next(); // Limpar o buffer do Scanner
            }
        }
        return valor;
    }

    public int vaga() {
        int valor;
        while (true) {
            try {
                System.out.println("Digite quantas vagas vai precisar: ");
                valor = p.nextInt();
                if (valor >= 0) {
                    break; // Saia do loop se o valor for válido
                } else {
                    System.out.println("Por favor, digite um valor positivo.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número válido.");
                p.next(); // Limpar o buffer do Scanner
            }
        }
        return valor;
    }

    public String zona() {
        String valor;
        while (true) {
            try {
                System.out.println("Digite se vai ser em zona COMERCIAL ou RESIDENCIAL: ");
                valor = p.next();
                if (valor.equalsIgnoreCase("COMERCIAL") || valor.equalsIgnoreCase("RESIDENCIAL")) {
                    break; // Saia do loop se o valor for válido
                } else {
                    System.out.println("Por favor, digite uma opção válida.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Entrada inválida. Digite uma opção válida.");
                p.next(); // Limpar o buffer do Scanner
            }
        }
        return valor;
    }
}
	