package cl.ds.app.models;

public class Hdd {

    private String fabricante;

    private String capacidad;

    private String rpm;

    private String tamano;

    private String bus;

    public Hdd() {
    }

    public Hdd(String fabricante, String capacidad, String rpm, String tamano, String bus) {
        this.fabricante = fabricante;
        this.capacidad = capacidad;
        this.rpm = rpm;
        this.tamano = tamano;
        this.bus = bus;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getRpm() {
        return rpm;
    }

    public void setRpm(String rpm) {
        this.rpm = rpm;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getBus() {
        return bus;
    }

    public void setBus(String bus) {
        this.bus = bus;
    }

    @Override
    public String toString() {
        return "Hdd{" +
                "fabricante='" + fabricante + '\'' +
                ", capacidad='" + capacidad + '\'' +
                ", rpm='" + rpm + '\'' +
                ", tamano='" + tamano + '\'' +
                ", bus='" + bus + '\'' +
                '}';
    }
}
