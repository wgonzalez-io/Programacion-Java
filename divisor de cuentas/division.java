import java.util.Scanner; //Este será un programa que nos ayudara a repartir la cuenta de una mesa entre varias personas, incluyendo el porcentaje de propina que se desea dejar.
public class division {
    class persona{
        String nombre;
        double consumo;
        public persona(String nombre, double consumo){
            this.nombre = nombre;
            this.consumo = consumo;
        }
        public void mostrarDatos(){
            System.out.println("Nombre: " + nombre);
            System.out.println("Consumo: " + consumo);
        }
    }    
    class consumo{
        String producto;
        double precio;
        persona cliente;
        public consumo(String producto, double precio, persona cliente){
            this.producto = producto;
            this.precio = precio;
            this.cliente = cliente;
        }
        public void mostrarDatos(){
            System.out.println("Producto: " + producto);
            System.out.println("Precio: " + precio);
            System.out.println("Cliente: " + cliente.nombre);
        }
        public void calcularConsumo(){
            cliente.consumo += precio;
        }
    }
    class gastoCompartido{
        double montoTotal;
        String descripcion;
        double porcentajePropina;
        public gastoCompartido(double montoTotal, String descripcion, double porcentajePropina){
            this.montoTotal = montoTotal;
            this.descripcion = descripcion;
            this.porcentajePropina = porcentajePropina;
        }
    }
    public static void main (String [] args){

    }
}
