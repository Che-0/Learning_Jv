/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg14_comportamientoobjetos;

/**
 *
 * @author CHARLY
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        CuentaBancaria rfc = new CuentaBancaria();
        
        //de esta manera nos aseguramos que nadie va a pocer modificar los valores de las var 
       /* rfc.saldo = -123;
        rfc.alias = "#$%$#/%"; <---- como esta en privado solo lo podemos modificar con un metodo
        rfc.RFC = "simon";
        */
       rfc.mostrarDatos();
       rfc.setAlias("manuel");
       rfc.setAlias(null);
       rfc.mostrarDatos();
       
        
        String a = rfc.getAlias();
        System.out.println(a);
        
        
        
        
        
        
        /*
  
        //System.out.println(rfc.RFC + " " + rfc.alias + " " + rfc.saldo);   ---- ya no se necesita
        rfc.mostrarDatos();       //este metodo sustituye el desmadre de arriba 
        rfc.RFC = "MSRN92810";
        rfc.alias = "Madona";
        rfc.saldo = 125000.50f;
       // System.out.println(rfc.RFC + " " + rfc.alias + " " + rfc.saldo);
       
        rfc.mostrarDatos();
       
        System.out.println("\n");
        double x = rfc.obtenerSaldo();
        System.out.println(x);
        
        
        rfc.depositar(-125000);  //valide en la otra clase para que no se pudieranmeter numeros ngativos
        
        System.out.println(rfc.obtenerSaldo());
        
        System.out.println(rfc.saldoDisponible(125000));
        System.out.println(rfc.saldoDisponible(126000));
        
        rfc.extraer(10500);
        System.out.println(rfc.obtenerSaldo());
        */
    }
    
}
