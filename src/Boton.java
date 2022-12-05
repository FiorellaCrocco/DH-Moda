public class Boton extends Producto{
    @Override
    public double calcularPrecio() {
        return this.costo * this.getMARGEN_DE_GANANCIA();
    }
}
