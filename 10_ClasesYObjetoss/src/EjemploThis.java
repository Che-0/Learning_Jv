/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CHARLY
 */
public class EjemploThis {
    String nombre;
    String marca;
    String modelo;
    
    
   //Definir constructor
    //Para hacer esto debemos usar exactamente el mismo nombre de la clase 
    
     EjemploThis (String nombre, String marca, String modelo )
    {
        
        this.nombre = nombre;
        this.marca =  marca;
        this.modelo = modelo;
        
    }
    
    //-------------^^^^^^^^^^^^^^^^-------------//
    /*Arriba esta el ejemplo
    this en su empleamiento mas basico se utiliza para evitar ambiguedades
    ¿qué nombvre es igual a que nombre?
    con el this eso se aclara
    
    Su nombrfe = nombre
    this.nombre
     
     
     De momento solo veo esta funcionalidad, tiene más 
    */
    
    
    public static void main(String[] args) {
         EjemploThis carro1,carro2,carro3;
        
        carro1 = new  EjemploThis ("bocho","wols","re pincge antiguo");
        carro2 = new  EjemploThis ("Mustang","nose","burn");
        carro3 = new  EjemploThis ("Acura","so existe?","4578");
        
        System.out.println(carro1.modelo );
    }
}

