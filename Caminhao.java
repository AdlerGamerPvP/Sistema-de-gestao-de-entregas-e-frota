public class Caminhao extends Veiculo{
    private double pesomax;
    public Caminhao(String placa, String modelo, double precoPorKM, String situacao, double pesomax, double carga) {
        super(placa, modelo, precoPorKM, situacao, carga, pesomax);
    }

    @Override
    public void calcularCusto(double km) {
        custo = precoPorKM * km + (carga / 2.5);

    }
}
