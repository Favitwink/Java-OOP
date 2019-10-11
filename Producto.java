public class Producto {
    static int productosCreados = 0;
    int id = 0;
    String nombre = "desconocido";
    int precio = 0;
    final boolean unico;
    Producto() {
        unico = false;
        productosCreados++;
        id = productosCreados;
    }
    Producto(String name, int price) {
        unico = true;
        precio = price;
        nombre = name;
        productosCreados++;
        id = productosCreados;
    }
    Producto cambiarValores(int id, String name, int price) {
        this.id = id;
        this.nombre = name;
        this.precio = price;
        return this;
    }
    Producto cambiarValores(String name, int price) {
        return cambiarValores(id, name, price);
    }
    Producto cambiarValores(int id, String name) {
        return cambiarValores(id, name, this.precio);
    }
    Producto cambiarValores(int id) {
        return cambiarValores(id, this.nombre, this.precio);
    }
}
