/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CHARLY
 */
public class CicloWhile {
    public static void main(String[] args) {
       int control = 100;
       int contador;
        while (control >= 40)
        {
            contador = control;
             System.out.println("valor de control "+contador );
             control = control-20;
        }
        System.out.println("fin del ciclo");
    }
}
