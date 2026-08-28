import java.util.Scanner;
public class nomina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreTrabajador, dato1, dato2;
        float precioHora=0, salarioBruto,impuesto, salarioNeto, horaExtra;
        int horasTrabajadas=0;
        boolean valid=true;
        String letras = "[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+";

        //Aqui ya empezamos a pedir los datos hasta que sea valido
        do{
        System.out.println("Ingrese el nombre del trabajador: ");
        nombreTrabajador=sc.nextLine().trim(); //El trim es para evitar que metan espacios en blanco
        if(nombreTrabajador.matches(letras) && nombreTrabajador.length()>=15){
            System.out.println("\nNombre registrado con éxito");
        }
        else if(nombreTrabajador.length()<15){
            System.out.println("\nDebe ingresar su nombre completo");
        }
        else{
            System.out.println("\nSolo puedes ingresar letras");
        }
        }while(!nombreTrabajador.matches(letras) || nombreTrabajador.length()<15);

        //Vamos con las horas que se ha trabajado
        do{
            try{
                System.out.println("Ingrese las horas trabajadas: ");
                dato1=sc.nextLine();
                horasTrabajadas=Integer.parseInt(dato1);
                if(horasTrabajadas<=0){
                    System.out.println("\nDebe ingresar una cantidad mayor a 0");
                    valid=false;
                }
                else{
                    System.out.println("Cantidad registrada con exito");
                    valid=true;
                }
            }catch(NumberFormatException e){
                System.out.println("\nSolo puedes ingresar numeros enteros positivos, no decimales ejemplo: 1,2,3,4,5");
                valid=false;
            }
        }while(!valid);

        //Ahora pedimos el precio por hora
        do{
            try{
                System.out.println("Ingrese su precio por hora trabajada $:");
                dato2=sc.nextLine();
                precioHora=Float.parseFloat(dato2);
                if(precioHora<=0){
                    System.out.println("\nDebe ingresar una cantidad mayor a 0");
                    valid=false;
                }
                else{
                    System.out.println("Cantidad registrada con éxito");
                    valid=true;
                }
            }catch(NumberFormatException e){
                System.out.println("\nSolo puedes ingresar numeros");
                valid=false;
            }
        }while(!valid);

        //ahora veremos si el trabajador aplica para horas extra
        if(horasTrabajadas<=35){
            salarioBruto=horasTrabajadas*precioHora;
        }
        else{
            horaExtra=(horasTrabajadas-35)*1.5f; //La f se pone para que lo reconozca como float y no double
            salarioBruto=(35f+horaExtra)*precioHora;
        }
        
        //Ahora vamos a ver los impuestos 
        if(salarioBruto<=2200){
            impuesto=0;
        }
        else if(salarioBruto<=2220){
            impuesto=(salarioBruto-2000f)*0.20f;
        }
        else{
            impuesto=(220f*0.20f)+((salarioBruto-2220f)*0.30f);
        }

        //Ya tenemos los impuestos, ahora sacamos el neto y mandamos a imprimir
        salarioNeto=(salarioBruto-impuesto);
        System.out.println("\nResultados");
        System.out.println("Nombre del trabajador: " + nombreTrabajador);
        System.out.println("Salario bruto: $ " + salarioBruto);
        System.out.println("Impuesto a pagar: $ " + impuesto);
        System.out.println("Salario neto: $ " + salarioNeto);
        sc.close();
    }
}
