import static java.lang.IO.*;
import static java.util.ArrayList.*;

void main() {
    double carregamento = 0, km = 0, custo = 0;
    int acao = 0, escolha = 0;
    ArrayList<Veiculo> veiculos = new ArrayList<>();

    veiculos.add(new Moto("P1JK", "Honda CB 1000R", 6.51, "Pronto", 0, 35));
    veiculos.add(new Carro("TZE3", "Volkswagen Saveiro", 6.51, "Manutenção", 0,  115));
    veiculos.add(new Caminhao("6761", "Volkswagen Delivery Express", 6.51, "Pronto", 1335, 0));

    while(acao != 5) {
        while(acao == 1) {
            for(int x = 0; x < veiculos.size(); x++){
                println(veiculos.get(x));
                println(x + 1);
            }
            try {
                escolha = Integer.parseInt(readln("Escolha o veiculo para entrega: "));
                escolha--;
                veiculos.get(escolha);
            }
            catch (IndexOutOfBoundsException e){
                println("Valor invalido, tente novamente");
            }
            carregamento = Double.parseDouble(readln("Digite o quanto deseja carregar: "));
            println(carregamento);
            if(carregamento < 0) {
                println("Carga não pode ser negativa, tente novamente");
            }
            else{
            if(carregamento > veiculos.get(escolha).pesomax){
                    println("Erro, esta carga ultrapassa o limite de peso");
                    break;
                }
            else{
                println(carregamento);
                veiculos.get(escolha).carga = carregamento;
                println(veiculos.get(escolha).carga);
               }
            }
            break;
        }
        while(acao == 2){
            for(int x = 0; x < veiculos.size(); x++){
                println(x);
                println(veiculos.get(x));
            }
            try {
                escolha = Integer.parseInt(readln("Escolha o veiculo para entrega: "));
                escolha--;
            }
            catch (IndexOutOfBoundsException e){
                println("Valor invalido, tente novamente");
                break;
            }
            if(veiculos.get(escolha).situacao.equalsIgnoreCase("Pronto")){
                km = Double.parseDouble(readln("Digite a distancia da viagem: "));
                veiculos.get(escolha).entregar();
                println("O veiculo saiu para entregar");
            }
            else{
                println("Este veiculo não esta pronto para entregas");
            }
           break;
        }
        while (acao == 3){
            for(int x = 0; x < veiculos.size(); x++){
                veiculos.get(x).calcularCusto(km);
                println(x + 1);
                println(veiculos.get(x));
            }
            break;
        }
        while(acao == 4){
           escolha = Integer.parseInt(readln("1- Retirar veiculo da manutenção \n2- Transferir veiculo para manutenção\n"));
            if (escolha == 1){
                for(int x = 0; x < veiculos.size(); x++){
                    println(x);
                    println(veiculos.get(x));
                }
                try {
                    escolha = Integer.parseInt(readln("Escolha um veiculo para retirar da manutenção"));
                    escolha--;
                }
                catch (IndexOutOfBoundsException e){
                    println("Valor invalido, tente novamente");
                }
                if (veiculos.get(escolha).situacao.equalsIgnoreCase("Manutenção")){
                    veiculos.get(escolha).retManut();
                    println("Seu veiculo saiu da manutenção");
                }
                else{
                    println("Seu veiculo não está na manutenção");
                }
                break;
            }
            if (escolha == 2){
                for(int x = 0; x < veiculos.size(); x++){
                    println(x);
                    println(veiculos.get(x));
                }
                try {
                    escolha = Integer.parseInt(readln("Escolha um veiculo para colocar na manutenção"));
                    escolha--;
                }
                catch (IndexOutOfBoundsException e){
                    println("Valor invalido, tente novamente");
                }
                if (veiculos.get(escolha).situacao.equalsIgnoreCase("Pronto")){
                    veiculos.get(escolha).envManut();
                    println("Seu veiculo entrou na manutenção");
                }
                if (veiculos.get(escolha).situacao.equalsIgnoreCase("Manutenção")){
                    println("Este veiculo já está na manutenção");
                }
                else{
                    println("Seu veiculo não pode ir para a manutenção atualmente");
                }
                break;
            }
            else{
                println("Escolha invalida, tente novamente");
                break;
            }


        }
        acao = Integer.parseInt(readln("1- Carregar veiculo\n2- Entregar\n3- Ver dados\n4- Manutenção\n5- Sair \n"));

    }
    println("Volte novamente");
}