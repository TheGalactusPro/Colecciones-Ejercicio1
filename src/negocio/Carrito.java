package negocio;
import java.util.ArrayList;
public class Carrito {
    private ArrayList<ItemCarrito> items;
    public Carrito() {
        items = new ArrayList<>();
    }
    public void agregarProducto(Producto producto, int cantidad) {
        ItemCarrito item = new ItemCarrito(producto, cantidad);
        items.add(item);
    }
    public int obtenerCantidadItems() {
        return items.size();
    }
    public double calcularTotal() {
        double total = 0;
        for (ItemCarrito item : items) {
            total += item.calcularSubtotal();
        }
        return total;
    }
    public boolean eliminarItem(int posicion) {
        if (posicion >= 0 && posicion < items.size()) {
            items.remove(posicion);
            return true;
        }
        return false;
    }
    public String mostrarResumen() {
        String resumen = "CARRITO DE COMPRAS\n";
        for (ItemCarrito item : items) {
            resumen += item.mostrarInformacion() + "\n";
        }
        resumen += "------------------------------\n";
        resumen += "Cantidad de items: " + obtenerCantidadItems() + "\n";
        resumen += "TOTAL: $" + calcularTotal();
        return resumen;
    }
}