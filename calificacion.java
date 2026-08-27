import java.util.Scanner;
public class calificacion {
    public static void main(String[] args) {
        String dato;
        int calificacion=-1;
        boolean valido;
        Scanner sc = new Scanner(System.in);
        //Aqui se inicia un bucle para solicitar la nota hasta que sea valida
        do{
        System.out.println("Rango de calificaciones");
        System.out.println("Nota mayor o igual a 90 ------- A");
        System.out.println("Nota mayor o igual a 80 pero menor que 90------B");
        System.out.println("Nota mayor o igual a 70 pero menor que 80------C");
        System.out.println("Nota igual a 69 ------D");
        System.out.println("Nota menor de 69------F");
        System.out.println("\nDigite una calificacion de acuerdo al rango mostrado anteriormente: ");
        dato = sc.nextLine();
        //En este try, se está validando que solo ingresen números
        try{
            calificacion = Integer.parseInt(dato);
            valido = true;
        }catch(NumberFormatException e){
            System.out.println("Solo puedes ingresar letras");
            valido = false;
        }
        //Aqui se verifica que la nota este dentro del rango
        if(calificacion<0 || calificacion>100){
            System.out.println("Nota Inválida, ingrese una calificacion dentro del rango permitido");
            valido = false;
        }
        }while(valido!=true);

        //Ahora que la nota es valida vamos a imprimirla
        switch(calificacion/10){
            case 10:
            case 9:
                System.out.println("Su calificacion es A");
                break;
            case 8:
                System.out.println("Su calificacion es B");
                break;
            case 7:
                System.out.println("Su calificacion es C");
                break;
            case 6:
                System.out.println("Su calificacion es D");
                break;
            default:
                System.out.println("Su calificacion es F");
        }
        sc.close();
    }
}
