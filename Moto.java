public class Moto extends Veiculo {
    public Moto(String placa, String modelo, double precoPorKM, String situacao, double carga, double pesomax) {
        super(placa, modelo, precoPorKM, situacao, carga, pesomax);
    }

    @Override
    public void calcularCusto(double km) {
       this.custo = this.precoPorKM * km;
    }
}
