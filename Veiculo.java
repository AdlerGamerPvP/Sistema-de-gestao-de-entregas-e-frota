abstract class Veiculo {
        protected String placa;
        protected String modelo;
        protected double precoPorKM;
        protected String situacao;
        protected double custo;
        protected double km;
        protected double pesomax;
        protected double carga;


        public String envManut(){
          situacao = "Manutenção";
          return "O Veiculo está na manutenção";
        }

        public String retManut(){
            situacao = "Pronto";
            return "O veiculo saiu da manutenção";
        }

        public abstract void calcularCusto(double km);


        public String entregar(){
            situacao = "Em Transito";
            return "O veiculo saiu para entrega";
        }

        public Veiculo(String placa, String modelo, double precoPorKM, String situacao, double carga, double pesomax){
            this.placa = placa;
            this.modelo = modelo;
            this.precoPorKM = precoPorKM;
            this.situacao = situacao;
            this.carga = carga;
            this.pesomax = pesomax;
        }

    @Override
    public String toString() {
        if (situacao.equalsIgnoreCase("Em Transito")){
            return "\nVeiculo: " + placa +
                    "\nModelo: " + modelo +
                    "\nStatus: " + situacao +
                    "\nPeso da carga:" + carga +
                    "\nCusto: " + custo;

        }
        if (situacao.equalsIgnoreCase("Manutenção")){
            return "\nVeículo: " + getClass() +
                   "\nPlaca: " + placa +
                   "\nSituação: " + situacao;
        }
        if (situacao.equalsIgnoreCase("Pronto")){
            return "\nVeiculo: " + getClass() +
                    "\nPlaca: " + placa +
                    "\nModelo: " + modelo +
                    "\nStatus: " + situacao +
                    "\nPeso da carga:" + carga +
                    "\nCusto: " + custo;

        }
        return null;
    }
}
