public class Carro extends Veiculo{

    public Carro(String placa, String modelo, double precoPorKM, String situacao, double carga, double pesomax) {
        super(placa, modelo, precoPorKM, situacao, carga, pesomax);
    }

    @Override
    public void calcularCusto(double km) {
        custo = (precoPorKM * km) * 1.25;

    }
}
