package veiculos;

public class Moto implements Veiculo {
    private static final double valor_pedagio = 2.50;

    @Override
    public double calcularPedagio() {
        return valor_pedagio;
    }

    @Override
    public String getTipo() {
        return "Moto";
    }
}