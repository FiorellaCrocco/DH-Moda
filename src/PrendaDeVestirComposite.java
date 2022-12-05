import java.util.ArrayList;

public class PrendaDeVestirComposite extends Producto{
    private ArrayList<Producto> materialesUtilizados = new ArrayList();
    private double costoManoDeObra;
    @Override
    public double calcularPrecio() {
        double total = 0;
        for (Producto p: materialesUtilizados) {
            total += p.costo;
        }
        return total+costoManoDeObra;
    }

    public double calcularPrecio(double descuento) {
        double total = 0;
        for (Producto p: materialesUtilizados) {
            total += p.costo;
        }
        return (total+costoManoDeObra)-descuento;
    }

    public void agregarMaterial(Producto producto){
        this.materialesUtilizados.add(producto);
    }

    public void quitarMaterial(Producto producto){
        this.materialesUtilizados.remove(producto);
    }

    public String mostrarMateriales(){
        String listaDeMateriales = "";

        for (int i = 0; i < this.materialesUtilizados.size(); i++) {
            listaDeMateriales += "\n  " + (i+1) + ". " + this.materialesUtilizados.get(i).getNombre() + " " + this.materialesUtilizados.get(i).getColor();
        }

        return listaDeMateriales;
    }

    public double getCostoManoDeObra() {
        return costoManoDeObra;
    }

    public void setCostoManoDeObra(double costoManoDeObra) {
        this.costoManoDeObra = costoManoDeObra;
    }
}
