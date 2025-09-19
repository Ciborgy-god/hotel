public class Main {
    public static void main(String[] args) {
        Hotel hotel = new Hotel("Hotel Metallica");

        Quarto quarto1 = new Quarto(101, 1);
        Quarto quarto2 = new Quarto(202, 2);
        Quarto quarto3 = new Quarto(303, 3);

        hotel.addQuarto(quarto1);
        hotel.addQuarto(quarto2);
        hotel.addQuarto(quarto3);

        Cargo Recepcionista = new Cargo("Recepcionista");
        Cargo Faxineiro = new Cargo("faxineiro");
        Cargo Camareira = new Cargo("Camareira");

        Funcionario f1 = new Funcionario("Ana", 2350.5, Recepcionista);
        Funcionario f2 = new Funcionario("Guilerme", 2050, Faxineiro);
        Funcionario f3 = new Funcionario("Maria", 2050, Camareira);

        Hospede h1 = new Hospede("Marcos", "Rua joão, 212", "352125861");
        Hospede h2 = new Hospede("Hellen", "Rua Brusque 548", "231863578");
        Hospede h3 = new Hospede("Willian", "Rua Fagundes 183", "123456789");

        Veiculo v1 = new Veiculo("A1B3C", "Fiat uno");
        Veiculo v2 = new Veiculo("D2E4F", "Mustang");
        Veiculo v3 = new Veiculo("5G6H7I", "Ferrari");

        Reserva reserva1 = new Reserva("12/05/2025", "12/05/2026");
        Reserva reserva2 = new Reserva("09/02/2020", "01/02/2029");
        Reserva reserva3 = new Reserva("06/06/2022", "03/04/2027");

        reserva1.checkin(h1);
        reserva2.checkin(h2);
        reserva3.checkin(h3);

        quarto1.addReserva(reserva1);
        quarto2.addReserva(reserva2);
        quarto3.addReserva(reserva3);

        reserva1.checkout();
        reserva2.checkout();
        reserva3.checkout();




    }
}