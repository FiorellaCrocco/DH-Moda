import java.time.LocalDate;
import java.util.ArrayList;

public class Boleta {
        private ArrayList<Producto> productos = new ArrayList();
        private LocalDate fecha;
        private boolean estaPaga = false;


        //Metodos

        public void agregarProducto(Producto producto){
            this.productos.add(producto);
        }

        public void quitarProducto(Producto producto){
            this.productos.remove(producto);
        }
        public String mostrarProductos(){
            String listaProductos = "";
            for (Producto p : productos) {
                listaProductos += "\n  " +  "- " + p.nombre + " ";
            }
            return listaProductos;
        };

        public double calcularTotal(){
            double totalFinal = 0.0;
            for (Producto p : productos) {
                totalFinal += p.calcularPrecio();
            }
            return totalFinal;
        };

        public void finalizarBoleta(){
            if (this.productos==null){
                System.out.println("No hay productos");
            } else {
                this.estaPaga = true;
                this.fecha = LocalDate.now();
            }
        }

        //Getter & Setter
        public ArrayList<Producto> getProductos() {
            return productos;
        }

        public void setProductos(ArrayList<Producto> productos) {
            this.productos = productos;
        }

        public LocalDate getFecha() {
            return fecha;
        }

        public void setFecha(LocalDate fecha) {
            this.fecha = fecha;
        }

        public boolean isEstaPaga() {
            return estaPaga;
        }

        public void setEstaPaga(boolean estaPaga) {
            this.estaPaga = estaPaga;
        }
}
