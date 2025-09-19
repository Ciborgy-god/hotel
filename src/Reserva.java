public class Reserva {
    private String dataEntrada;
    private String dataSaida;
    public Hospede h;
    public Veiculo veiculo;

    public Reserva(String dataEntrada, String dataSaida) {
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    public void checkin(Hospede h) {
        this.h = h;
        System.out.println("Check-in realizado para " + h.getNome() + " hóspede(s).");
        System.out.println("Carro: " + veiculo.getModelo() + " Placa :  " + veiculo.getPlaca());
        System.out.println("Reserva: " + dataEntrada + " - " + dataSaida  );
    }

    public void checkout() {
        System.out.println("Checkout realizado. Hóspedes: " + h.getNome());
    }

    public void cancelar() {
        System.out.println("Reserva cancelada.");
    }

    public void addVeiculo(Veiculo v) {
        this.veiculo = v;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }
}