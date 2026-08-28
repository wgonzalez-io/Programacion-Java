import java.util.Scanner;
public class ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int calificación = -1;
        do{
            System.out.println("Menú calificación.");
        System.out.println(" ");
        System.out.println("Grado mayor o igual a 90............... A");
        System.out.println("Menor de 90 pero mayor o igual a 80.... B");
        System.out.println("Menor de 80 pero mayor o igual a 70.... C");
        System.out.println("Menor de 70 pero mayor o igual a 69.... D");
        System.out.println("Menor de 69............................ E");
        System.out.println(" ");
        System.out.println("Digite una calificación de acuerdo al menú mostrado:");
        try{
            calificación = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e){
            System.out.println("Solo puedes ingresar numeros enteros, no decimales ejemplo: 80");
        }
        if (calificación >=  0 && calificación <= 100){
            switch (calificación / 10) {
            case 10:
            case 9:
                if (calificación >= 90){
                    System.out.println("Grado en letra A");
                }
                break;
            case 8:
                if (calificación >= 80){
                    System.out.println("Grado en letra B");
                }
                break;
            case 7 :
                if (calificación >= 70){
                    System.out.println("Grado en letra C");
                }
                break;
            case 6 :
                if (calificación == 69){
                    System.out.println("Grado en letra D");
                } else {
                    System.out.println("Grado E");
                }
                break;
            default:
                System.out.println("Grado E");
                break;
        }
        } else {
            System.out.println("Debe ingresar una nota válida entre 0 a 100");
        }
        
        } while (calificación < 0 || calificación > 100);
        sc.close();
    }
}
