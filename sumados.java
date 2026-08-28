import java.util.Scanner;
public class sumados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String dato1, dato2;
        int num1=0, num2=0, resultado;
        boolean valido=true;
        //Iniciamos el bucle para pedir el primer numero hasta que sea valido
        do{
            try{
                System.out.println("Escriba el primer numero: ");
                dato1=sc.nextLine();
                num1=Integer.parseInt(dato1);
                valido=true; //si no ponemos el true aqui, el bucle se repite 
            }catch(NumberFormatException e){
                System.out.println("\nSolo puedes ingresar numeros enteros");
                valido=false;
            }
        }while(!valido);
        //Iniciamos el bucle para pedir el segundo numero hasta que sea valido
        do{
            try{
                System.out.println("\nEscriba el segundo numero: ");
                dato2=sc.nextLine();
                num2=Integer.parseInt(dato2);       
                valido=true;     
            }catch(NumberFormatException e){
                System.out.println("\nSolo puedes ingresar numeros enteros");
                valido=false;
            }
        }while(!valido);

        //Ahora efectuamos la suma y la imprimimos
        resultado=num1+num2;
        System.out.println("El resultado de la suma es: " + resultado);
        sc.close();
    }
}
