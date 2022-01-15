package com.company;

import java.util.Scanner;

public class CalculadoradeImpostos {

    public static void main (String[] args) {

        Double calculavalorimpostoicms;
        Double calculavalorimpostoipi;
        Double totaldeimpostos = 0.00;
        Double calculavalorimpostopis;
        Double calculavalorimpostocofins;
        Double totalgeral = 0.00;
        Double totalporempresa;
        Double totalmercadorias = 0.00;
        Double desconto = 0.1;
        Double descontoaplicado;
        Double valorcomdesconto;

        Scanner scan=new Scanner(System.in);

        System.out.print("Demanda: ");

        int empresa= scan.nextInt();
        int cont=0;
        while (cont < empresa){

            Scanner entrada = new Scanner(System.in);

            Double valorunitario = 4.50;
            int quantidade;
            int referencia = 500;
            Double valorbruto;
            Double impostoicms = 0.18;
            Double impostoipi = 0.04;
            Double impostopis = 0.0186;
            Double impostocofins = 0.0854;

            System.out.print("Empresa: ");
            String nomeempresa = entrada.nextLine();

            System.out.print("Quantidade: ");
            quantidade = entrada.nextInt();

            System.out.print("Cliente: " + nomeempresa + "\n");

            valorbruto = valorunitario * quantidade;
            calculavalorimpostoicms = impostoicms * valorbruto;
            calculavalorimpostoipi = impostoipi * valorbruto;
            calculavalorimpostopis = impostopis * valorbruto;
            calculavalorimpostocofins = impostocofins * valorbruto;
            totalporempresa = valorbruto + calculavalorimpostoicms + calculavalorimpostoipi + calculavalorimpostopis + calculavalorimpostocofins;
            descontoaplicado = desconto*valorbruto;
            valorcomdesconto = totalporempresa - descontoaplicado;

            System.out.print(" ICMS: R$" + calculavalorimpostoicms);
            System.out.print(" IPI: R$" + calculavalorimpostoipi);
            System.out.print(" PIS: R$" + calculavalorimpostopis);
            System.out.print(" COFINS: R$" + calculavalorimpostocofins);
            System.out.print(" Total por Empresa: R$" + totalporempresa + "\n");

            if (quantidade > referencia){
                System.out.print("Valor com desconto: R$" + valorcomdesconto + "\n");
                System.out.print("Desconto aplicado: " + descontoaplicado + "\n");
            }

            totaldeimpostos += calculavalorimpostoicms + calculavalorimpostoipi + calculavalorimpostopis + calculavalorimpostocofins;
            totalgeral = totalgeral + totalporempresa;
            totalmercadorias = totalgeral - totaldeimpostos;

            cont++;
        }

        System.out.print("Total de Impostos: R$" + totaldeimpostos + "\n");
        System.out.print("Total Mercadorias: R$" + totalmercadorias + "\n");
        System.out.print("Total Geral: R$" + totalgeral + "\n");

    }
}

