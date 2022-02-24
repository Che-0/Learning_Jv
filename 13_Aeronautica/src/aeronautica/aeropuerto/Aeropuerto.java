/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aeronautica.aeropuerto;

import aeronautica.aviones.Avion;
//se supone que aqui va import aeronautica.aviones.Avion
//pero esta madre no la reconoce, solo con el puntero 
//pero el puntero indica que importe todas las clases que encuentre 
//aunque no se recomienda

public class Aeropuerto {
    Avion[] aviones;
    
    Aeropuerto (Avion[] aviones)
    {
        this.aviones = aviones;
        
    }
    
    Aeropuerto(Avion avion)
    {
        this.aviones = new Avion[50];
        
        this.aviones[0] = avion;
    }
    
}
