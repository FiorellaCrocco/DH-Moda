public class ProductoFactoryMethodSingleton {
    private static ProductoFactoryMethodSingleton instancia;

    private ProductoFactoryMethodSingleton(){};

    public static ProductoFactoryMethodSingleton obtenerInstancia(){
        if (ProductoFactoryMethodSingleton.instancia == null) {
            ProductoFactoryMethodSingleton.instancia = new ProductoFactoryMethodSingleton();
        }

        return ProductoFactoryMethodSingleton.instancia;
    }

    public Producto crearProducto(String tipo){
        switch (tipo){
            case "Hilo":
                return new Hilo();
            case "Boton":
                return new Boton();
            case "Tela":
                return new Tela();
            case "Prenda":
                return new PrendaDeVestirComposite();
        }
        return null;
    }
}
