package veiculos;

public class Caminhao implements Veiculo {
    private static final double valor_pedagio = 10.00;
    private static final double valor_por_eixo = 2.00;

    private int eixos;

    public Caminhao(int eixos) {
        this.eixos = eixos;
    }

    @Override
    public double calcularPedagio() {
        return valor_pedagio + (valor_por_eixo * eixos);
    }

    @Override
    public String getTipo () {
        return "Caminhão";
    }

}