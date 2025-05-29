package util;

public class RelatorioPedagio {
    private static int totalVeiculos = 0;
    private static double totalArrecadado = 0.0;

    public static void adicionarValor(double valor) {
        totalVeiculos ++;
        totalArrecadado += valor;
    }

    public static void exibirRelatorio() {
        System.out.println("\n==== RELATÓRIO DO PEDÁGIO ====");
        System.out.println("Total de veículos: " + totalVeiculos);
        System.out.printf("Total arrecadado: R$ %.2f%n", totalArrecadado);
    }
}