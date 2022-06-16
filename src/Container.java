public class Container {
    private String carga;
    private int peso;

    public Container(String carga, int peso) {
        this.carga = carga;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Container{" +
                "carga='" + carga + '\'' +
                ", peso=" + peso +
                '}';
    }

    public static Container generateContainer(){

    }
}
