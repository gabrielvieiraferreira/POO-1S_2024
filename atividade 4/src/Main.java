public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2022, 85000.00, 4);
        Moto moto = new Moto("Honda", "CBR 500R", 2021, 35000.00, true);
        Caminhao caminhao = new Caminhao("Volvo", "FH16", 2020, 350000.00, 40.0);

        System.out.println("Detalhes do Carro:");
        carro.imprimirDetalhes();
        System.out.println();

        System.out.println("Detalhes da Moto:");
        moto.imprimirDetalhes();
        System.out.println();

        System.out.println("Detalhes do Caminhão:");
        caminhao.imprimirDetalhes();
    }
}