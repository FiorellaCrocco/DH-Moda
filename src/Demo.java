public class Demo {
    public static void main(String[] args) {
        ProductoFactoryMethodSingleton creador = ProductoFactoryMethodSingleton.obtenerInstancia();

        System.out.println("\nRAZO:");
        Tela razoBlanco = (Tela) creador.crearProducto("Tela");
        razoBlanco.setNombre("Razo");
        razoBlanco.setColor("Blanco");
        razoBlanco.setCosto(1250.0);
        System.out.println("Precio $" + razoBlanco.calcularPrecio());

        System.out.println("\nSEDA:");
        Tela sedaRosa = (Tela) creador.crearProducto("Tela");
        sedaRosa.setNombre("Seda");
        sedaRosa.setColor("Rosa");
        sedaRosa.setCosto(950.0);
        System.out.println("Precio $" + sedaRosa.calcularPrecio());

        System.out.println("\nBOTON GRANDE:");
        Boton botonGrande = (Boton) creador.crearProducto("Boton");
        botonGrande.setNombre("BotonGrande");
        botonGrande.setColor("Dorado");
        botonGrande.setCosto(150.0);
        System.out.println("Precio $" + botonGrande.calcularPrecio());

        System.out.println("\nHILO DE SEDA NEGRO:");
        Hilo hiloDeSedaNegro = (Hilo) creador.crearProducto("Hilo");
        hiloDeSedaNegro.setNombre("Hilo de Seda");
        hiloDeSedaNegro.setColor("Negro");
        hiloDeSedaNegro.setCosto(200.0);
        System.out.println("Precio $" + hiloDeSedaNegro.calcularPrecio());

        System.out.println("\nHILO DE SEDA BLANCO:");
        Hilo hiloDeSedaBlanco = (Hilo) creador.crearProducto("Hilo");
        hiloDeSedaBlanco.setNombre("Hilo de Seda");
        hiloDeSedaBlanco.setColor("Blanco");
        hiloDeSedaBlanco.setCosto(175.0);
        System.out.println("Precio $" + hiloDeSedaBlanco.calcularPrecio());

        System.out.println("\nVESTIDO DE NOVIA:");
        PrendaDeVestirComposite vestidoDeNovia = (PrendaDeVestirComposite) creador.crearProducto("Prenda");
        vestidoDeNovia.setNombre("VestidoDeNovia");
        vestidoDeNovia.setCostoManoDeObra(7500.0);
        vestidoDeNovia.agregarMaterial(razoBlanco);
        vestidoDeNovia.agregarMaterial(sedaRosa);
        vestidoDeNovia.agregarMaterial(hiloDeSedaBlanco);
        System.out.println("Materiales: " + vestidoDeNovia.mostrarMateriales());
        System.out.println("Precio $" + vestidoDeNovia.calcularPrecio());

        System.out.println("\nBOLETA:");
        Boleta boleta = new Boleta();
        boleta.agregarProducto(vestidoDeNovia);
        boleta.agregarProducto(botonGrande);
        boleta.agregarProducto(hiloDeSedaBlanco);
        System.out.println("Precio Total $" + boleta.calcularTotal());
        System.out.println("Productos: " + boleta.mostrarProductos());
        boleta.finalizarBoleta();
        System.out.println("¿Se ha finalizado la boleta? " + boleta.isEstaPaga());
    }
}

