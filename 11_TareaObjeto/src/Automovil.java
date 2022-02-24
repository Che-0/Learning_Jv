/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CHARLY
 */
public class Automovil {
    String marca;
    String submarca;
    int modelo;
    String color;
    
    
    //Constructor
    Automovil (String marca, String submarca,int modelo, String color)
    {
        this.marca = marca;
        this.submarca = submarca;
        this.modelo = modelo;
        this.color = color;
    }
    
    public static void main(String[] args) {
        Automovil miBochido,miAkura,miMustang;
        
        miBochido = new Automovil("VW","Sedan",1970,"Azul");
        miAkura = new Automovil ("Akura","NSX",2013,"Gris");
        miMustang = new Automovil ("Ford","Mustang",2010,"Amarillo");
        
        
    }
}
