import java.util.ArrayList;
import java.util.List;

public class Quarto {
    private int numero;
    private int andar;
    private List<Reserva> reservas = new ArrayList<>();

    public Quarto(int numero, int andar) {
        this.numero = numero;
        this.andar = andar;
    }

    public int getNumero() {
        return numero;
    }

    public int getAndar() {
        return andar;
    }

    public void addReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public List<Reserva> getReservas() {
        return reservas;
    }
}