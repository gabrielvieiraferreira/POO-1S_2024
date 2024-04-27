public class Moto extends Veiculo {
    private boolean partidaEletrica;

    public Moto(String marca, String modelo, int ano, double preco, boolean partidaEletrica) {
        super(marca, modelo, ano, preco);
        this.partidaEletrica = partidaEletrica;
    }

    @Override
    public void imprimirDetalhes() {
        super.imprimirDetalhes();
        System.out.println("Partida Elétrica: " + (partidaEletrica ? "Sim" : "Não"));
    }
}
