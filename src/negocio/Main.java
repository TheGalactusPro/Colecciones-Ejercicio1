package negocio;
public class Main {
    public static void main(){
        Producto p1 = new Producto("P01", "Mouse", 25.50);
        Producto p2 = new Producto("P02", "Teclado", 40.00);
        Producto p3 = new Producto("P03", "Monitor", 150.00);
        Carrito carrito = new Carrito();
        System.out.println("CARRITO VACIO");
        System.out.println(carrito.mostrarResumen());
        carrito.agregarProducto(p1, 2);
        carrito.agregarProducto(p2, 1);
        carrito.agregarProducto(p3, 1);
        System.out.println("\nCARRITO CON PRODUCTOS");
        System.out.println(carrito.mostrarResumen());
        System.out.println("\nCantidad de items: " + carrito.obtenerCantidadItems());
        System.out.println("Total a pagar: $" + carrito.calcularTotal());
        System.out.println("\nELIMINAR ITEM");
        boolean eliminado = carrito.eliminarItem(1);
        if (eliminado) {
            System.out.println("Producto eliminado correctamente");
        } else {
            System.out.println("Posicion invalida");
        }
        boolean eliminado2 = carrito.eliminarItem(10);
        System.out.println("Eliminacion de posicion 10: " + eliminado2);
        System.out.println("\nCARRITO ACTUALIZADO");
        System.out.println(carrito.mostrarResumen());
    }
}