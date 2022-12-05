public abstract class Producto {
    protected String nombre;
    protected String color;
    protected double costo;
    protected final double MARGEN_DE_GANANCIA = 1.3;

    //Metodos
    public abstract double calcularPrecio();

    //Getter & Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getMARGEN_DE_GANANCIA() {
        return MARGEN_DE_GANANCIA;
    }
}
