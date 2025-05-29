package veiculos;

public class Carro implements Veiculo {

    public static final double valor_pedagio = 5.00;
    
    @Override 
    public double calcularPedagio() {
        return valor_pedagio;
    }
    
    @Override
    public String getTipo() {
        return "Carro";
    }
}