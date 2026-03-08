package POO.Level1.ReservaHotel;

public class Main {
    public static void main(String[] args) {
        Recepcion recepcionista = new Recepcion();
        Cliente dylan = new Cliente("Dylan");
        Habitacion h1 = new Habitacion("HB1");
        Habitacion h2 = new Habitacion("HB2");
        Habitacion h3 = new Habitacion("HB3");
        Habitacion h4 = new Habitacion("HB4");
        Habitacion h5 = new Habitacion("HB5");
        Habitacion h6 = new Habitacion("HB6");

        recepcionista.crearReserva(dylan,h6);

        recepcionista.agregarHabitacion(h1);
        recepcionista.agregarHabitacion(h2);
        recepcionista.agregarHabitacion(h3);
        recepcionista.agregarHabitacion(h4);
        recepcionista.agregarHabitacion(h5);
        recepcionista.agregarHabitacion(h6);



        System.out.println("Estado de la habitacion h6: "+h6.getEstado());

        recepcionista.mostrarLibres();
    }
}
