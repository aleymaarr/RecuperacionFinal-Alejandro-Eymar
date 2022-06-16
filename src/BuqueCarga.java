public class BuqueCarga {
    private String nombre = "";
    private String espacio = "";

    public BuqueCarga(String nombre, String espacio) {
        this.nombre = nombre;
        this.espacio = espacio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspacio() {
        return espacio;
    }

    public void setEspacio(String espacio) {
        this.espacio = espacio;
    }
}
