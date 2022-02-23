/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CHARLY
 */

/*  Operadores Lógicos

Negaciom       !
comparaion     ==
diferente de   !=
mayor que       >
menor que       <
mayor o igual   >=
menor o igual   <=
y               &
o               |


*/
public class OpercacionesLogicas {
    public static void main(String[] args) {
        int primerNumero = 1;
        int segundoNumero = 2;
        int tercerNumero = 3;
        
        String primerTexto = "hola perra";
        String segundoTexto = "bienvencido";
        
        boolean operation;
        boolean operacion;
        
       // operation = (primerNumero < segundoNumero); true
        //operation = !(primerNumero < segundoNumero); false   lo invierte
        operation = (primerNumero != segundoNumero); 
        operacion = (primerNumero + segundoNumero) == tercerNumero;
        System.out.println(operation);
    }
}
