/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenip1_yahelbarahona;

/**
 *
 * @author elies
 */
public class ExamenIP1_YahelBarahona {
    
    public static void metodocabeza(int n){
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n-1) {
                for (int j = 0; j < n; j++) {
                    System.out.print("* ");
            }
            } 
            else {
                for (int j = 0; j < n; j++) {
                    if (j == 0 || j == n -1) {
                        System.out.print("* ");
                    }
                    else
                        System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
    public static void metodocuerpo(int n){
        for (int i = 0; i < 10; i++) {
             if (i == n/2) {
                for (int j = 0; j < n; j++) {
                    System.out.print("* ");
            }
                 System.out.println();
            } 
            else {
                for (int j = 0; j < n; j++) {
                    if (j == n/2) {
                        System.out.print("* ");
                    }
                    else
                        System.out.print("  ");
                }
                 System.out.println();
        }
}}

    public static void metodopies(int n){
        for (int i = 0; i < n/2; i++) {
            for (int k = 0; k < i; k++) {
                    System.out.print("  ");
                    }
            System.out.print("* ");
            System.out.println();
                }
     
}
        
           
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       byte opcion;
       int num;
        java.util.Scanner get = new java.util.Scanner(System.in);
       
        do {
            System.out.print("""
                               \nOpciones 
                               1.Mi maestro de matematicas
                               2.Que molesta mi instructor
                               3.Cifrados Primarios
                               4.Terminar programa
                               Que opcion va a selecionar? """);  
            opcion = get.nextByte();
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese un valor de n mayor o igual a 10: ");
                    num = get.nextInt();
                    if (num >= 10) {
                        metodocabeza(num);
                        metodocuerpo(num);
                        metodopies(num);
                    }else
                        System.out.println("Tiene que ser mayor o igual de 10");
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    break;
                default:
                    System.out.println("No es opcion");
            }
        } while (opcion !=4);
    }
    
}
