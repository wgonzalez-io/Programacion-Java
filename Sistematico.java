import java.util.Scanner;
public class Sistematico {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        String nombre, precioS, horaS;
        String letras = "[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+";
        int horas=0;
        double impuestoTasa=0.25, salarioBruto, salarioNeto, precio=0, impuesto; 
        boolean valido, valido1;
        do{
            System.out.println("Ingrese su nombre completo: ");
            nombre=sc.nextLine().trim();
            if(nombre.matches(letras) && nombre.length()>=15){
                System.out.println("\nNombre registrado con éxito");
            }
            else if(nombre.length()<15){
                System.out.println("\nDebes ingresar al menos 15 caracteres");
            }
            else{
                System.out.println("\nSolo puedes ingresar letras");
            }
        }while(!nombre.matches(letras) || nombre.length()<15);

        do{
            try{
                System.out.println("Ingrese la cantidad de horas trabajadas: ");
                horaS=sc.nextLine();
                horas=Integer.parseInt(horaS);
                if(horas<=0){
                    System.out.println("\nIngrese un valor mayor que 0");
                    valido=false;
                }
                else{
                    System.out.println("\nHoras registradas con éxito");
                    valido=true;
                }
            }catch(NumberFormatException e){
                System.out.println("\nSolo puedes ingresar numeros enteros");
                valido=false;
            }
        }while(!valido);

        do{
            try{
                System.out.println("Ingrese el precio por cada hora de trabajo $: ");
                precioS=sc.nextLine();
                precio=Double.parseDouble(precioS);
                if(precio<=0){
                    System.out.println("\nIngrese un valor mayor que 0");
                    valido1=false;
                }
                else{
                    System.out.println("\nPrecio por hora registrado con éxito");
                    valido1=true;
                }
            }catch(NumberFormatException e){
                System.out.println("\nSolo puedes ingresar numeros");
                valido1=false;
            }
        }while(!valido1); 

        salarioBruto= horas*precio;
        impuesto= salarioBruto*impuestoTasa;
        salarioNeto=salarioBruto-impuesto;

        System.out.println("\n ----Salario menos deducciones----");
        System.out.println("Nombre del empleado: " + nombre);
        System.out.println("Salario Bruto: $" + salarioBruto);
        System.out.println("Impuesto a pagar: $" + impuesto);
        System.out.println("Salario neto a recibir: $" + salarioNeto);
        sc.close();
    } 
}
