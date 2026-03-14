package POO.Level3.Restaurant;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Mesa reception;
    private Cliente client;
    private List<Plato> plates;

    public Pedido(Mesa reception, Cliente client) {
        this.reception = reception;
        this.client = client;
        this.plates = new ArrayList<>();
    }

    public Mesa getReception() {
        return reception;
    }

    public Cliente getClient() {
        return client;
    }

    public void agregarPlate (Plato plate) {
        plates.add(plate);
    }

    public int removePlate (String plato) {
        plates.stream()
                        .filter(p -> p.getName().equals(plato))
                                .findFirst()
                                        .ifPresent(plates::remove);
        return plates.size();
    }

    public double calculateTotal () {
        double total = 0;
        for (Plato plate : plates) {
            total = total + plate.getPrice();
        }
        total = Math.round(total*100.0)/100.0;
        return total;
    }

    public void mostrarPedido (){
        System.out.println("no voy a mostrar el pedido porque eso lo hare en otros ejercicios donde practicare con strems collectors y etc");
    }
}
