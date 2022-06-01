package com.mycompany.caixa.eletronico.ds1m;
import java.util.Scanner;
public class CaixaEletronico {
    public static void main(String[] args) {
        
        /* DECLARAÇÃO DO OBJETO DE CONTA: */
        Conta objConta = new Conta();
        
        /* DECLARAÇÃO Do OBJETO de SCANNER: */
        Scanner objScanner = new Scanner(System.in);
        
        int opcao = 0;
        while(opcao != 4){
            /* MENU DE ACESSO: */
            System.out.println("\n1 - VERIFICAR SALDO ");
            System.out.println("2 - REALIZAR DEPÓSITO ");
            System.out.println("3 - REALIZAR SAQUE ");
            System.out.println("4 - SAIR ");
            System.out.println("ESCOLHA UMA OPÇÃO (DIGITE O NÚMERO): ");
            opcao = objScanner.nextInt();
            
            double valor = 0;
            switch(opcao){
                case 1:
                    /* CHAMADA DO MÉTODO DE SALDO */
                    System.out.println("SALDO ATUAL: " + objConta.verificarSaldo());
                    break;

                case 2:
                    /* CHAMADA DO MÉTODO DE DEPÓSITO */
                    System.out.println("DIGITE O VALOR DE DEPÓSITO: ");
                    valor = objScanner.nextDouble();
                    objConta.realizarDeposito(valor);
                    System.out.println("----- DEPÓSITO REALIZADO -----");
                    break;

                case 3:
                    /* CHAMADA DO MÉTODO DE SAQUE */
                    System.out.println("DIGITE O VALOR DE SAQUE: ");
                    valor = objScanner.nextDouble();
                    objConta.realizarSaque(valor);
                    System.out.println("----- SAQUE REALIZADO -----");
                    break;

                case 4:
                    System.out.println("OBRIGADO POR USAR O SISTEMA!");
                    break;

                default:
                    System.out.println("OPÇÃO INVÁLIDA!");
            }
        }
    }
}