
package taller5.ejercicio1;

public class PruebaProducto {

    public static void main(String[] args) {

        Producto producto = new Producto("Laptop", 2500000, 10);

        producto.mostrarInfo();

        System.out.println("Acceso al nombre: " + producto.nombre);
        System.out.println("Acceso al precio: " + producto.precio);
        System.out.println("Acceso al stock: " + producto.stock);
    }
}
