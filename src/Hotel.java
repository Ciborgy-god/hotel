import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private String nome;
    private List<Quarto> quartos = new ArrayList<>();

    public Hotel(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void addQuarto(Quarto quarto) {
        quartos.add(quarto);
    }

    public List<Quarto> getQuartos() {
        return quartos;
    }
}
