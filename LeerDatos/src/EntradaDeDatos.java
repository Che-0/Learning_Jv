
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CHARLY
 */

//CUIDADO CON NEXTINT   no lo pongas antes de strings
//si lo haces tienes que poner un sc.nextLine para que salte ese texto y no la entrada de datos

public class EntradaDeDatos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Ingressa tu edad: ");
        int edad = sc.nextInt();
        sc.nextLine();  //<--------para que se salte este texto
        
        System.out.println("Por favor ingrese su nombre: ");
        String nombre = sc.nextLine();
         
        
        System.out.println(nombre + " en 10 años tendras" + (edad+10) + " años");
    }
}
