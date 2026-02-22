package PAGE2.Level6.Restaurant;

import java.util.ArrayDeque;
import java.util.Queue;

public class Pedidos {
    private Queue<Plato> pedidos;
    private int cantidadTotalPedidos = 0;

    public Pedidos () {
        pedidos = new ArrayDeque<>();
    }

    public void agregarPedidos (Plato comida) {
        pedidos.offer(comida);
        cantidadTotalPedidos += 1;
        comida.setOrderAssociate(cantidadTotalPedidos);
    }

    public Plato verSiguiente () {
        return pedidos.peek();
    }

    public Plato atenderSiguiente () {
        return pedidos.poll();
    }

    public int cantidadDePlatosAtendidos () {
        return cantidadTotalPedidos-pedidos.size();
    }

    public int quedanPorAtender () {
        return pedidos.size();
    }

    public int getTotalDePedidos() {
        return cantidadTotalPedidos;
    }
}
