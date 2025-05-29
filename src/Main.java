import util.RelatorioPedagio;
import veiculos.Caminhao;
import veiculos.Carro;
import veiculos.Moto;
import veiculos.Veiculo;

public class Main {
    public static void main (String[] args) {
        Veiculo v1 = new Carro();
        Veiculo v2 = new Caminhao(4);
        Veiculo v3 = new Moto();
        Veiculo v4 = new Caminhao(6);
        Veiculo v5 = new Carro();


        processarPedagio(v1);
        processarPedagio(v2);
        processarPedagio(v3);
        processarPedagio(v4);
        processarPedagio(v5);

        RelatorioPedagio.exibirRelatorio();
    }

    public static void processarPedagio(Veiculo veiculo) {
        double valor = veiculo.calcularPedagio();
        System.out.printf("Veículo: %s | Valor do Pedágio: R$ %.2f%n", veiculo.getTipo(), valor);
        RelatorioPedagio.adicionarValor(valor);
    }
}