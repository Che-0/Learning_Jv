/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg14_comportamientoobjetos;

/**
 *
 * @author CHARLY
 */
public class CuentaBancaria {
    String RFC;
    String alias;
    double saldo;
    
    void mostrarDatos() //metodo para imprimir en pantalla los datos 
    {
        System.out.println(RFC + " " + alias + " " +saldo); //ya nose necesita del . porque accedes directo a la var
        
    }
    
    //cuando un metodo devuelve un valor, se tiene que poner un return al finas :
    
    double obtenerSaldo()
    {
        return saldo;
    }
    
    void depositar(double monto)
    {
        if (monto>0)
        {
            saldo += monto;
        }
        
        else
        {
            System.out.println("Error");
        }
    }
    
    
          boolean saldoDisponible(double monto)
        {
            return ( monto <= saldo );
          
            
        }
          
          
        void extraer(double monto)
        {
            if (saldo>=monto)
            {
                saldo -= monto;   
            }
        }
        
        //otra maneraen la que se puede expresar esa funcion es esta
        
        /*
            void extraer(double monto)
        {
            if (saldoDisponible(monto)
            {
                saldo -= monto;   
            }
        }
        
        
        */
        //entonces se pueden usar las funciones de la misma clase 
}
