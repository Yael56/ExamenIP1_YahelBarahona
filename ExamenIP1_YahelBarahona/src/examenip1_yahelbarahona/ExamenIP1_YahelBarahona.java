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
       public static void Cadenas(String cad1, String cad2) {
       String ban = "";
       
           for (int i = cad1.length() - 1; i >= 0 ; i--) {
               ban += cad1.charAt(i);
           }
           if (ban.equals(cad2)) {
               System.out.println("Es una rotacion circular");}
           else
           System.out.println("No es una rotacion circular");
           
       }
    
       public static boolean EsPrimo(char a){
        return a == '3' || a == '5' || a == '7';
       }
       public static int Queprimo(char a){
           int b;
           switch (a) {
               case '3':
                   b = 3;
                   break;
               case '5':
                   b = 5;
                   break;
               case '7':
                   b = 7;
                   break;
               default:
                   throw new AssertionError();
           }
           return b;
       }
       
       public static void cifrado(String cifra, String numeros){
         char y, z;
         int x = 0, w = 0;
         String primo = "", cifrado = "";
         
           for (int i = 0; i < numeros.length(); i++) {
               if (EsPrimo(numeros.charAt(i))) {
                   primo += numeros.charAt(i);
                   y = numeros.charAt(i);
                   x += Queprimo(y);
               }
               
           }
           if (primo.equals("")) {
               System.out.println("No se encontraron numeros primos en la cadena. No se puede cifrar.");
           }
           else{
               System.out.println("Numeros Primos Encontrados: " + primo);
               System.out.println("Clave Generada: " + x);
               for (int i = 0; i < cifra.length(); i++) {
                   z = cifra.charAt(i);
                   w = z + x;
                   y = (char) w;
                   cifrado += y;
               }
               System.out.println("Mensaje Cifrado: " + cifrado);
           }  
       } //15740, Clave 2451p2
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       byte opcion;
       int num;
       String cadena1, cadena2, mensaje, num2;
       java.util.Scanner get = new java.util.Scanner(System.in);
        java.util.Scanner text = new java.util.Scanner(System.in);
       
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
                    System.out.print("Cadena 1: ");
                    cadena1 = text.nextLine();
                    System.out.print("Cadena 2: ");
                    cadena2 = text.nextLine();
                    Cadenas(cadena1,cadena2);
                    break;
                case 3:
                    System.out.println("**Bienvenido al cifrador de mensajes**");
                    System.out.println("Ingrese el mensaje que desea cifrar:");
                    mensaje = text.nextLine();
                    System.out.println("Ingrese una cadena con numeros de cifrado:");
                    num2 = text.nextLine();
                    System.out.println();
                    System.out.println("\n--- Resultados ---");
                    cifrado(mensaje, num2);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("No es opcion");
            }
        } while (opcion !=4);
    }
    
}
