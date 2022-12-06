package cl.ds.app.models;

public class PlacaMadre {

    private String socket;

    private String chipset;

    private String memorias;

    private String formato;

    private String fabricante;

    public PlacaMadre() {
    }

    public PlacaMadre(String socket, String chipset, String memorias, String formato, String fabricante) {
        this.socket = socket;
        this.chipset = chipset;
        this.memorias = memorias;
        this.formato = formato;
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "PlacaMadre{" +
                "socket='" + socket + '\'' +
                ", chipset='" + chipset + '\'' +
                ", memorias='" + memorias + '\'' +
                ", formato='" + formato + '\'' +
                ", fabricante='" + fabricante + '\'' +
                '}';
    }
}
