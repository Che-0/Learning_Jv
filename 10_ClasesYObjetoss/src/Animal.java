/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CHARLY
 */
public class Animal {
    String nombre;
    float peso;
    String raza;
    
    
   //Definir constructor
    //Para hacer esto debemos usar exactamente el mismo nombre de la clase 
    
    Animal(String nombreDelAnimal, float pesoDelAnimal, String razaDelAnimal  )
    {
        
        nombre = nombreDelAnimal;
        peso =  pesoDelAnimal;
        raza =  razaDelAnimal;
        
    }
    
    
    public static void main(String[] args) {
        Animal animal1;
        
        animal1 = new Animal("Juan",15.0f,"Humano");
        Animal animal2 = new Animal("Julio",13.4f,"Humano"); //Esta mas chido declarar todos de un golpe
        
        System.out.println(animal2.nombre );
    }
}
