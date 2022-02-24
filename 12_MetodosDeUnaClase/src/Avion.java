/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CHARLY
 */
public class Avion {
    double peso;
    int combustible;
    double alturaDeVuelo;
    String identificador;
    
    public Avion (double peso, int combustible, double alturaDeVuelo, String identificador){
            this.peso = peso;
            this.combustible = combustible;
            this.alturaDeVuelo = alturaDeVuelo;
            this.identificador = identificador; 
    }     
    
    //metodo despegar
    
    boolean despegar()
    {
        this.combustible = this.combustible -20;
        this.alturaDeVuelo = this.alturaDeVuelo +20;
        
        return this.combustible > 0;
       /*if (this.combustible > 0 )
        {
            return true;
        }
        else
        {
       return false; 
        }
*/
    }
    
    public static void main(String[] args) {
        Avion avion1 = new Avion(35000,5000,0,"hgeger");
        avion1.despegar();
    }

}