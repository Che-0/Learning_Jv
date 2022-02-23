/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CHARLY
 */
public class Arreglo {
    public static void main(String[] args) {
        //Un arreglo en java es una serie de valores con un tipo
        //en su interior solo puede tenere numeros y strings o caracarteres
        //PERO NO UNA MEZCLA DE TODOS ELLOS
        
        //Estructura array
       String x[] = {"1","2d","3","4"};    //<--- Este arreglo posee numeros, por ende es de tipo entero 
       int y[] = {1,2,3,4};
       String r[][] = {{"hola","wey"},
                       {"hijo","tres"},
                       {"de", "una"},
                       {"puta","asi es", "we"}};
       
       System.out.println(r[0][1]);
       
       //System.out.println(x[0]); 
       //System.out.println(y[1]);
       
    }
}
