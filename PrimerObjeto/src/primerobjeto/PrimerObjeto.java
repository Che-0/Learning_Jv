/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primerobjeto;

/**
 *
 * @author CHARLY
 */
public class PrimerObjeto 
{

    public static void main(String[] args) 
    {
        Auto a = new Auto();
        System.out.println(a.patente + " " + a.color + " " + a.kms + " " +a.conAire);
        a.patente = "afuf";
        a.color = "verde";
        a.kms = 599;
        a.conAire = true;
        
        //System.out.println(a.patente + " " + a.color + " " + a.kms + " " +a.conAire); 
        
        System.out.println(a);
       //se muestra el identificador 
        
        Auto a2 = new Auto();
       // System.out.println(a2.patente + " " + a2.color + " " + a2.kms + " " +a2.conAire);
        a2.patente = "qwerty";
        a2.color = "ve";
        a2.kms = 9;
        a2.conAire = true;
        
        //System.out.println(a2.patente + " " + a2.color + " " + a2.kms + " " +a2.conAire);
        System.out.println(a2);
        //se muestra el identificador 
    }
}
