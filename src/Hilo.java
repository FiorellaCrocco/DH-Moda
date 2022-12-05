public class Hilo extends Producto{

    @Override
    public double calcularPrecio() {
        return this.costo * this.getMARGEN_DE_GANANCIA();
    }
}
