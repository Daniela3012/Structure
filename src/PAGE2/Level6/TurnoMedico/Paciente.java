package PAGE2.Level6.TurnoMedico;

public class Paciente {
    private String name;
    private int orderAssociete;

    public Paciente (String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getOrderAssociete() {
        return orderAssociete;
    }

    public void setorderAssociete (int order) {
        this.orderAssociete = order;
    }
}
